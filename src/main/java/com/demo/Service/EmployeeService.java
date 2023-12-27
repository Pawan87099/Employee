    package com.demo.Service;

    import com.demo.Entity.Employee;
    import com.demo.Repository.EmployeeRepository;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.Optional;
    import java.util.UUID;

    @Service
    public class EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        public String addEmployee(Employee employee) {
            employee.setId(UUID.randomUUID().toString());
            employeeRepository.save(employee);
            return employee.getId();
        }

        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        public void deleteEmployeeById(String id) {
            employeeRepository.deleteById(id);
        }

        public void updateEmployeeById(String id, Employee updatedEmployee) {
            Optional<Employee> existingEmployeeOptional = employeeRepository.findById(id);

            if (existingEmployeeOptional.isPresent()) {
                Employee existingEmployee = existingEmployeeOptional.get();
                existingEmployee.setEmployeeName(updatedEmployee.getEmployeeName());
                existingEmployee.setPhoneNumber(updatedEmployee.getPhoneNumber());
                existingEmployee.setEmail(updatedEmployee.getEmail());
                existingEmployee.setReportsTo(updatedEmployee.getReportsTo());
                existingEmployee.setProfileImage(updatedEmployee.getProfileImage());

                employeeRepository.save(existingEmployee);
            }
        }
    }

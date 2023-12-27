
package com.demo.Repository  ;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Employee;
 

@Repository
public interface EmployeeRepository extends CouchbaseRepository<Employee, String>{
	
}

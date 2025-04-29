package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// second layer is repository layer (data access layer)
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	/*JpaRepository is a generic interface which is a part of spring data JPA,
      this interface provides CRUD operations for a specific entity,
      <Employee, Integer> entity is Employee and Integer is the type of entity primary key(id)
    */
	// that's it ... no need to write any code LOL!
	public List<Employee> findAllByOrderByLastNameAsc();
/*added a custom query method to get all employees from the database
sorted by their last name in ascending order (A to Z)*/
}


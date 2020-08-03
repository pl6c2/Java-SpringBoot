package com.example.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Optional<Employee> findOneByAbout(String about);

//	Optional<Employee> findByAgeCountEquals(int ageEquals);
	
//	Optional<Employee> findByTopOrderByAgeCountDesc();
	
	@Query("select e from Employee e where e.age=:age")
	Optional<Employee> findOneByAbout(@Param("age") int age);
	
	

	
}

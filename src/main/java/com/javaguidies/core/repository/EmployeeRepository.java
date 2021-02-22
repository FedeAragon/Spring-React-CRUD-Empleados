package com.javaguidies.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguidies.core.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

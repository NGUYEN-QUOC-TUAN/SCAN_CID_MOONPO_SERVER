package com.moonpo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moonpo.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> {

}

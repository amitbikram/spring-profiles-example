package com.sarangi.profiles.springprofilesexample.repository;

import com.sarangi.profiles.springprofilesexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer > {
}

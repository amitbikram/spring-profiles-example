package com.sarangi.profiles.springprofilesexample.batch;

import com.sarangi.profiles.springprofilesexample.model.Employee;
import com.sarangi.profiles.springprofilesexample.repository.EmployeeRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DBWriter implements ItemWriter<Employee> {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> employees) throws Exception {
        System.out.println("Data saved for employees: "+employees);
        // employeeRepository.save(employees);
    }
}

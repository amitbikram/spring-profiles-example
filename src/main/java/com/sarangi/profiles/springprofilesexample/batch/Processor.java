package com.sarangi.profiles.springprofilesexample.batch;

import com.sarangi.profiles.springprofilesexample.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {
    private static final Map<String, String> deptNames = new HashMap<>();

    public Processor() {
        deptNames.put("001", "technology");
        deptNames.put("002", "finance");
        deptNames.put("003", "IT");
        deptNames.put("004", "operations");
    }

    @Override
    public Employee process(Employee employee) throws Exception {
        String deptCode = employee.getDept();
        String dept = deptNames.get(deptCode);
        employee.setDept(dept);
        return null;
    }
}

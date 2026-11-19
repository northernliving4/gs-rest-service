package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Responsible for initializing the Employees class with hard-coded data.
 */
@Component
public class EmployeeManager {

    private final Employees employees = new Employees();

    public EmployeeManager() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("E001", "Ada", "Lovelace",
                "ada.lovelace@example.com", "Software Engineer"));
        list.add(new Employee("E002", "Grace", "Hopper",
                "grace.hopper@example.com", "Engineering Manager"));
        list.add(new Employee("E003", "Alan", "Turing",
                "alan.turing@example.com", "Data Scientist"));
        list.add(new Employee("E004", "Margaret", "Hamilton",
                "margaret.hamilton@example.com", "Systems Architect"));
        employees.setEmployeeList(list);
    }

    public Employees getEmployees() {
        return employees;
    }
}

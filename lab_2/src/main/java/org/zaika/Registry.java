package org.zaika;

import org.zaika.entity.Employee;
import org.zaika.exceptions.EmployeeInRegistryException;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final Registry workersRegistry = new Registry();
    private final List<Employee> workers = new ArrayList<>();

    public static Registry getRegistry(){
        return workersRegistry;
    }

    public void addEmployee(Employee emp) throws EmployeeInRegistryException {
        if(workers.contains(emp)){
            throw new EmployeeInRegistryException("The written employee is already exist");
        }
        workers.add(emp);
    }

    public void printList() {
        for (Employee emp : workers) {
            emp.printEmployee();
        }
    }
}

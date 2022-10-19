package org.zaika.composite;

import org.zaika.composite.exeptions.IncorrectSalaryException;
import org.zaika.composite.exeptions.FieldLengthLimitException;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private static int nextID = 1;
    public final static int MAX_LENGTH = 25;

    private final int id;
    private final int bossID;
    private final String name;
    private final String departmentName;
    private final double salary;
    private final List<Employee> subordinates;

    public Employee(String name, String departmentName, double salary, int bossID) throws Exception {


        if (name.length() > MAX_LENGTH || departmentName.length() > MAX_LENGTH) {
            throw new FieldLengthLimitException(
                    "The name or department name is too big" + '\n' +
                            "------------------------------");
        }

        if (salary < 0) {
            throw new IncorrectSalaryException(
                    "Employee has incorrect salary" + '\n' +
                            "------------------------------");
        }

        subordinates = new ArrayList<>();

        this.id = nextID++;
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        this.bossID = bossID;
    }

    public int getId() {
        return id;
    }

    public void remove(Employee emp) {
        subordinates.remove(emp);
    }

    public void add(Employee emp) {
        subordinates.add(emp);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }


    public void printEmployee() {
        System.out.printf(
                "id: " + id + '\n' +
                        "name: " + name + '\n' +
                        "department name: " + departmentName + '\n' +
                        "salary: " + salary + '\n' +
                        "boss id:" + bossID + '\n' +
                        "------------------------------" + '\n'
        );
    }

}
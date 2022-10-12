package org.zaika.entity;
import org.zaika.exceptions.IncorrectSalaryException;
import org.zaika.exceptions.FieldLengthLimitException;

public class Employee {
    private static int nextID = 1;
    public final static int MAX_LENGTH = 25;

    private final int id;
    private final String name;
    private final String departmentName;
    private final double salary;
    private final int managerID;

    public Employee(String name,
                    String departmentName,
                    double salary,
                    int managerID) throws Exception {

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

        this.id = nextID++;
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        this.managerID = managerID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public int getManagerID() {
        return managerID;
    }


    public void printEmployee() {
        System.out.printf(
                "id: " + id + '\n' +
                        "name: " + name + '\n' +
                        "department name: " + departmentName + '\n' +
                        "salary: " + salary + '\n' +
                        "manager id:" + managerID + '\n' +
                        "------------------------------" + '\n'
        );
    }
}



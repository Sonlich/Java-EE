package org.example;

public class Employee {
    private static int nextID = 1;
    public final static int MAX_LENGTH = 10;

    private int id;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws Exception {
        if (name.length() > MAX_LENGTH || surname.length() > MAX_LENGTH) {
            throw new FieldLengthLimitException(
                    "The name or surname is too big" + '\n' +
                            "------------------------------");
        }

        if (salary < 0) {
            throw new IncorrectSalaryException(
                    "Employee has incorrect salary" + '\n' +
                            "------------------------------");
        }

        this.id = nextID++;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    void printEmployee() {
        System.out.printf(
                "id: " + id + '\n' +
                        "name: " + name + '\n' +
                        "surname: " + surname + '\n' +
                        "salary: " + salary + '\n' +
                        "------------------------------" + '\n'
        );
    }
}

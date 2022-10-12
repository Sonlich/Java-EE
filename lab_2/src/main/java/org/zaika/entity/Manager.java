package org.zaika.entity;
import org.zaika.exceptions.IncorrectSalaryException;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name,
                   String departmentName,
                   double salary,
                   double bonus,
                   int managerID) throws Exception {
        super(name, departmentName, salary, managerID);
        this.bonus = bonus;
    }

    public void getBonus(double bonus) throws IncorrectSalaryException {
        if (bonus < 0) {
            throw new IncorrectSalaryException("The bonus can't be less than 0");
        } else {
            this.bonus = bonus;
        }
    }
}
package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee("Sofia", "Zaika", 12000);
        System.out.println(emp1);
        emp1.printEmployee();

        try {
            Employee emp2 = new Employee("Linaklovakds", "Novik", 10000);
            emp2.printEmployee();
        }catch (FieldLengthLimitException exp){
            System.out.println(exp.getMessage());
        }

        try{
            Employee emp3 = new Employee("Tolya", "Kram", -10);
            emp3.printEmployee();
        }catch (IncorrectSalaryException exp) {
            System.out.println(exp.getMessage());
        }

        try {
            Employee emp4 = new Employee("Danil", "Menetill", 15000);
            emp4.printEmployee();
        } catch (IncorrectSalaryException exp) {
            System.out.println(exp.getMessage());
        }
    }
}
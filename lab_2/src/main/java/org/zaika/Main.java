package org.zaika;
import org.zaika.entity.Employee;
import org.zaika.entity.Manager;
import org.zaika.exceptions.EmployeeInRegistryException;

public class Main {
    public static void main(String[] args) throws Exception {
        Registry registry = Registry.getRegistry();

        Manager manager = new Manager("Sofia Zaika", "Manager", 12000, 3000, 22);
        Employee emp1 = new Employee("Illidan Stormrage", "Analytics", 16000, manager.getManagerID());
        Employee emp2 = new Employee("Uther the Lightbringer", "Finnance", 80000, manager.getManagerID());

        try {
            registry.addEmployee(manager);
            registry.addEmployee(emp1);
            registry.addEmployee(emp2);

            registry.printList();

            registry.addEmployee(emp1);
        }catch (EmployeeInRegistryException exp) {
            System.out.println(exp.getMessage());
        }
    }
}


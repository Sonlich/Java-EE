package org.zaika.composite;

public class CompositePatternDemo {
    public static void main(String[] args) throws Exception {
        Employee headBoss = new Employee("Arthas Menethil", "Director", 50000, 1);
        Employee SalesBoss = new Employee("Uther the Lightbringer", "Sales", 30000, headBoss.getId());
        Employee AnalyticBoss = new Employee("Jaine Proudmoore", "Analytic", 40000, headBoss.getId());


        Employee emp1 = new Employee("Leeroy Jenkins", "Sales", 150000, SalesBoss.getId());
        Employee emp2 = new Employee("Tirion Fordring", "Sales", 25000, SalesBoss.getId());
        Employee emp3 = new Employee("Kel'thas Sunstrider", "Analytic", 22000, AnalyticBoss.getId());
        Employee emp4 = new Employee("Khadgar", "Analytic", 18000, AnalyticBoss.getId());
        Employee emp5 = new Employee("Archmage Antondias", "Analytic", 20000, AnalyticBoss.getId());

        headBoss.add(SalesBoss);
        SalesBoss.add(emp1);
        SalesBoss.add(emp2);
        headBoss.add(AnalyticBoss);
        AnalyticBoss.add(emp3);
        AnalyticBoss.add(emp4);
        AnalyticBoss.add(emp5);

        headBoss.printEmployee();

        for (Employee subordinate : headBoss.getSubordinates()) {
            subordinate.printEmployee();

            for (Employee employee : subordinate.getSubordinates()) {
                employee.printEmployee();
            }
        }

    }
}

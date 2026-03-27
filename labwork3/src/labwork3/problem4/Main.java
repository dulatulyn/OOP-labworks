package labwork3.problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date d1 = new GregorianCalendar(2020, Calendar.MARCH, 15).getTime();
        Date d2 = new GregorianCalendar(2019, Calendar.JULY, 1).getTime();
        Date d3 = new GregorianCalendar(2022, Calendar.JANUARY, 10).getTime();

        Employee emp1 = new Employee("Charlie", 60000, d1, "AB123456C");
        Employee emp2 = new Employee("Alice", 75000, d2, "CD789012E");
        Manager mgr = new Manager("Bob", 90000, d3, "EF345678G", 15000);
        mgr.addEmployee(emp1);
        mgr.addEmployee(emp2);

        Employee[] employees = {emp1, emp2, mgr};

        Arrays.sort(employees);
        System.out.println("By salary:");
        for (Employee e : employees) System.out.println("  " + e);

        Arrays.sort(employees, new NameComparator());
        System.out.println("By name:");
        for (Employee e : employees) System.out.println("  " + e.getName());

        Arrays.sort(employees, new HireDateComparator());
        System.out.println("By hire date:");
        for (Employee e : employees) System.out.println("  " + e.getName() + " " + e.getHireDate());

        Employee cloned = emp1.clone();
        cloned.setSalary(99999);
        System.out.println("Original: " + emp1.getSalary());
        System.out.println("Clone: " + cloned.getSalary());

        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2));
    }
}

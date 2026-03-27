package labwork3.problem5;

import lab2.problem3.Time;
import labwork3.problem4.Employee;

public class Main {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 52.5),
                new Chocolate("Mars", 45),
                new Chocolate("KitKat", 41.5)
        };
        Sort.selectionSort(chocolates);
        System.out.println("Chocolates:");
        for (Chocolate c : chocolates) System.out.println("  " + c);

        Time[] times = {
                new Time(14, 30, 0),
                new Time(9, 15, 45),
                new Time(22, 0, 10),
                new Time(9, 15, 30)
        };
        Sort.bubbleSort(times);
        System.out.println("Times:");
        for (Time t : times) System.out.println("  " + t);

        Employee[] employees = {
                new Employee("Alice", 75000),
                new Employee("Dave", 55000),
                new Employee("Charlie", 60000)
        };
        Sort.selectionSort(employees);
        System.out.println("Employees:");
        for (Employee e : employees) System.out.println("  " + e.getName() + " " + e.getSalary());
    }
}

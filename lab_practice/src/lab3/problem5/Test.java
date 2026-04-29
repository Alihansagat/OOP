package lab3.problem5;

import lab3.problem4.Employee;

public class Test {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 70),
                new Chocolate("Mars", 45)
        };

        Time[] times = {
                new Time(14, 30, 10),
                new Time(9, 15, 20),
                new Time(14, 10, 5)
        };

        Employee[] employees = {
                new Employee("Alihan", 500000,
                        new java.util.Date(120, 5, 10), "INS001"),
                new Employee("Samat", 450000,
                        new java.util.Date(121, 3, 15), "INS002"),
                new Employee("Aruzhan", 700000,
                        new java.util.Date(119, 1, 20), "INS003")
        };

        System.out.println("CHOCOLATES BEFORE");
        printArray(chocolates);

        Sort.bubbleSort(chocolates);

        System.out.println("\nCHOCOLATES AFTER");
        printArray(chocolates);

        System.out.println("\nTIMES BEFORE");
        printArray(times);

        Sort.mergeSort(times);

        System.out.println("\nTIMES AFTER");
        printArray(times);

        System.out.println("\nEMPLOYEES BEFORE");
        printArray(employees);

        Sort.bubbleSort(employees);

        System.out.println("\nEMPLOYEES AFTER");
        printArray(employees);
    }

    public static <E> void printArray(E[] array) {
        for (E item : array) {
            System.out.println(item);
        }
    }
}
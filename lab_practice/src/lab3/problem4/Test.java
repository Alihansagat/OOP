package lab3.problem4;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alihan", 500000,
                new Date(120, 5, 10), "INS001");

        Employee e2 = new Employee("Samat", 450000,
                new Date(121, 3, 15), "INS002");

        Manager m1 = new Manager("Aruzhan", 700000,
                new Date(119, 1, 20), "INS003", 100000);

        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println("OBJECTS");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(m1);

        System.out.println("\nCOMPARE TO");
        System.out.println(e1.compareTo(e2));
        System.out.println(m1.compareTo(e1));

        System.out.println("\nCLONE");
        Employee clonedEmp = e1.clone();
        Manager clonedMan = m1.clone();

        System.out.println(clonedEmp);
        System.out.println(clonedMan);

        System.out.println("\nSORT BY NAME");
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(m1);

        Collections.sort(list, new NameComparator());

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("\nSORT BY HIRE DATE");
        Collections.sort(list, new HireDateComparator());

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("\nEQUALS");
        System.out.println(e1.equals(clonedEmp));
        System.out.println(m1.equals(clonedMan));
    }
}
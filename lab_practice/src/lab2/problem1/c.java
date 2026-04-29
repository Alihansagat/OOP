package lab2.problem1;

import lab2.problem1.Employee;

import java.util.HashSet;

public class c {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee("Ali", 19, "24B031983"));
        set.add(new Employee("Kana", 19, "24B032003"));
        set.add(new Employee("Ali", 19, "24B031983"));

        for(Employee employee : set) {
            System.out.println(employee);
        }

        System.out.println("Total employees in set: " + set.size());
    }
}
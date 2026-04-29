package practice3;

import java.util.Scanner;
import java.util.Vector;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Person> people = new Vector<>();
        boolean flag = true;

        while (flag) {
            System.out.println("Choose a action: ");
            System.out.println("1. Add Person");
            System.out.println("2. Display People");
            System.out.println("3. Exit");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 1:
                    System.out.println("Choose a type of people (1- Person, 2- Student, 3- Staff): ");
                    int peopleType = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    if (peopleType == 1) {
                        people.add(new Person(name, address));
                    } else if (peopleType == 2) {
                        System.out.print("Program: ");
                        String program = sc.nextLine();
                        System.out.print("Year: ");
                        int year = sc.nextInt();
                        System.out.print("Fee: ");
                        double fee = sc.nextDouble();
                        sc.nextLine();
                        people.add(new Student(name, address, program, year, fee));
                    } else if (peopleType == 3) {
                        System.out.print("School: ");
                        String school = sc.nextLine();
                        System.out.print("Pay: ");
                        double pay = sc.nextDouble();
                        sc.nextLine();
                        people.add(new Staff(name, address, school, pay));
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    for (Person p : people) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
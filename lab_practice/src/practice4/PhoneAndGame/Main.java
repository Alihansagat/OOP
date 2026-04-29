package practice4.PhoneAndGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Phone charging
        PowerSocket socket = new PowerSocket();
        iPhone phone = new iPhone("Iphone X");
        socket.charge(phone);

        // Student list
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 4.0));
        students.add(new Student("Charlie", 3.8));

        // Sort by GPA manually
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).gpa > students.get(j + 1).gpa) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted by GPA:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by Name manually
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).name.compareTo(students.get(j + 1).name) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }


        App app = new App();
        Game game1 = new LogicGame();
        Game game2 = new MemoryGame();
        app.getStatistics(game1);
        app.getStatistics(game2);
    }
}
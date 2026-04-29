package lab1;

import java.util.Scanner;
import java.util.Vector;

public class dragonLaunch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Person> kidnapped = new Vector<>();

        System.out.println("How many students were kidnapped? ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the gender of student " + (i + 1) + " (B/G): ");
            char input = sc.nextLine().toUpperCase().charAt(0);
            GENDER gender = (input == 'B') ? GENDER.B : GENDER.G;
            kidnapped.add(new Person(gender));
        }

        int ind = -1;
        for(int i = 0; i < numberOfStudents; i++) {
            Person current = kidnapped.get(i);

            if(ind >= 0){
                Person previous = kidnapped.get(ind);

                if (previous.getGender() == GENDER.B && current.getGender() == GENDER.G) {
                    ind--;
                    continue;
                }
            }

            ind++;
            kidnapped.set(ind, current);
        }

        Vector<Person> remaining = new Vector<>();
        for (int i = 0; i <= ind; i++) {
            remaining.add(kidnapped.get(i));
        }

        if (remaining.isEmpty()) {
            System.out.println("No students left! The dragon cannot eat.");
        } else {
            System.out.println("Students left for the dragon: " + remaining);
        }

    }
}
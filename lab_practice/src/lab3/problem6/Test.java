package lab3.problem6;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("Alihan", 18);
        Student s2 = new Student("Aruzhan", 20);

        Dog dog = new Dog("Buddy", 3);

        // Assign pet
        s1.assignPet(dog);

        // Print objects
        System.out.println(s1);
        System.out.println(s2);

        // Test custom interface methods
        s1.feedPet();
        s1.playWithPet();

        // Animal custom interface
        dog.learnTrick("Sit");

        // Test leave pet
        s1.leavePetWith(s2);

        System.out.println("\nAfter leaving pet:");
        System.out.println(s1);
        System.out.println(s2);

        // Test retrieve pet
        s1.retrievePetFrom(s2);

        System.out.println("\nAfter retrieving pet:");
        System.out.println(s1);
        System.out.println(s2);

        // Test Comparable
        if (s1.compareTo(s2) < 0) {
            System.out.println("\n" + s1.name + " is younger than " + s2.name);
        }

        // Test Cloneable
        Person clone = s1.clone();
        System.out.println("\nCloned object:");
        System.out.println(clone);
    }
}
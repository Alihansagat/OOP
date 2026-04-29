package practice4.CatAndPerson;

public class Student extends Person implements CanHavePizza, CanHaveParty, CanHaveRetake, Movable {
    public String name;
    Student(String name) {
        super(name);
    }

    public void eatPizza() {
        System.out.println(name + " eats pizza at university");
    }

    public void retakeExam() {
        System.out.println(name + " retakes the exam");
    }

    public void move() {
        System.out.println(name + " walks to class");
    }

    public void dance() {
        System.out.println(name + " dances at the party");
    }
}

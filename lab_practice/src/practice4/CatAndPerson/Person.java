package practice4.CatAndPerson;

public class Person implements CanHavePizza, CanHaveParty, CanHaveRetake, Movable {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void eatPizza() {
        System.out.println(name + " eats pizza");
    }

    public void retakeExam() {
        System.out.println(name + " takes retake");
    }
    public void move() {
        System.out.println(name + " moves ");
    }
    public void dance() {
        System.out.println(name + " dances");
    }
}

package practice3;

public class problem1 {
    public static void main(String[] args) {
        Animal a = new Dog("Huski");
        a.sound();
        a.eat("bones");

        Animal b = new Cat();
        b.sound();
        b.eat();
        b.sleep();
    }
}
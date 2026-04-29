package practice4.CatAndPerson;

public class Cat extends Animal implements CanHavePizza, Movable {
    public void eatPizza() {
        System.out.println("Cat eats pizza");
    }

    public void move() {
        System.out.println("Cat moves");
    }
}

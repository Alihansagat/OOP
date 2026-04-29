package lab3.problem2;

public class Airplane implements Flyable {
    @Override
    public void move() {
        System.out.println("The airplane is moving on the runway.");
    }

    @Override
    public void fly() {
        System.out.println("The airplane is flying in the sky.");
    }
}

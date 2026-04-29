package lab3.problem2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();

        car.move();

        airplane.move();
        airplane.fly();
    }
}
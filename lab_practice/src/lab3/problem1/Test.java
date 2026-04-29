package lab3.problem1;

public class Test {
    public static void main(String[] args) {
        Movable car = new Car();
        Movable robot = new Robot();
        Movable human = new Human();

        car.move();
        robot.move();
        human.move();

//      Why I used here interface movable, not a class?
//      Because these objects are completely different classes,
//      but they share one common ability.
    }
}
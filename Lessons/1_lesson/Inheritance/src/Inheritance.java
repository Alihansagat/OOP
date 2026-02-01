class Inheritance{
    public static void main(String[] args){
        Robot robot1 = new Robot();
        MyRobot myRobot1 = new MyRobot();

        robot1.setName("Golf");
        myRobot1.setName("Sam");

        robot1.setColor("Blue");
        myRobot1.setColor("Red");

        robot1.PrintParametrs();
        myRobot1.PrintParametrs();
    }
}
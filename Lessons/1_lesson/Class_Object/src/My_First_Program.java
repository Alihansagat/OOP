class My_First_Program {
    public static void main(String[] args) {
//        Robot Bender =  new Robot("Bender", 1);
//        Robot Sam =  new Robot("Sam", 2);

//        Bender.name = "Bender";
//        Sam.name = "Sam";
//
//        Bender.higth = 176;
//        Sam.higth = 182;

//        We can change the parametr which occured with constructor
//        Bender.higth = 12;
//
//        Bender.print_parametr();
//        Sam.print_parametr();


        Robot robot1 = new Robot("Bender", "black");
        Robot robot2 = new Robot("Sam", "white");

//        Then we can't acces to name or color, because our fields are private

        robot1.print_parametr();
        robot2.print_parametr();

        robot1.setColor("red");
        robot2.setColor("blue");
        robot1.print_parametr();
        robot2.print_parametr();
    }
}
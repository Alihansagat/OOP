class My_Program {
    public static void main(String[] args) {
////        Person human = new Person();
//        // in abstract class we can't create object with this class
//        Person human1 = new Man("Sam", 19);
//        Person human2 = new Woman("Mary", 21);
//
//        human1.printperson();
//        human2.printperson();



//        Interface give the access certain methods in class

        Men human = new Person();

        System.out.println(human.M1());
        System.out.println(((Person) human).M2());
    }
}
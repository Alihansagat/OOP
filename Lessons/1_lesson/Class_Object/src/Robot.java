public class Robot {
//    String name;
//    int higth;
//
////    Constructor
//    public Robot(String n, int h) {
//        name = n;
//        higth = h;
//    }
//
//    public void print_parametr(){
//        System.out.println("Name of robot - " + name);
//        System.out.println("Higth of robot - " + higth);
//    }

    private String name;
    private String color;

    public Robot(String n, String c){
        name = n;
        color = c;
    }

//    We can create a method to setting dates to private field
    public void setName(String x){
        name = x;
    }

    public void setColor(String x){
        color = x;
    }

    public void print_parametr(){
        System.out.println("Name of robot - " + name);
        System.out.println("Color of robot - " + color);
    }

}

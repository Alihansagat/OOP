public class Person implements Men, Women{
    private String name;
    private int age;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public void printperson(){
//        System.out.println("You'r name - " + name + " and age - " + age);
//        System.out.println("You'r sale - " + sales());
//    }

//    public abstract int sales();

    public int M1(){
        return 1;
    }
    public int M2(){
        return 2;
    }
    public int M3(){
        return 3;
    }
}

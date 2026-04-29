package practice3;

public class Animal {
    String name;

    public Animal(){
        System.out.println("Cat is created");
    }

    public Animal(String name){
        this.name = name;
        System.out.println("Animal created: " + name);
    }

//  Overriding
    public void sound() {
        System.out.println("I am an Animal");
    }

//  Overriding
    public void eat(){
        System.out.println("I am an Animal");
    }

    // Overloading
    public void eat(String meal){
        System.out.println(name + " eating a " + meal);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

}

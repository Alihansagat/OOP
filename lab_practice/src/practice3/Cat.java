package practice3;

public class Cat extends Animal{
    public Cat() {
        super();
        // using super without parameter
    }

    @Override
    public void sound(){
        System.out.println("Mew");
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating");
    }

    @Override
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}

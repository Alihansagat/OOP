package practice3;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
        // Using super with parameter
    }

    @Override
    public void sound(){
        System.out.println("Bark");
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating");
    }
}

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void eat(String food){
        System.out.println("Cat is eating the " +  food);
    }

    public void eat(){
        System.out.println("Cat is eating");
    }
}

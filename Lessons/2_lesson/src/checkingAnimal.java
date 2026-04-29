public class checkingAnimal{
    public static void main(String[] args) {
        Animal cat  = new Cat();
        cat.sound();

        Animal dog = new Dog();
        dog.sound();

        cat.eat();
        cat.eat("Wiskas");

        dog.eat();
        dog.eat("Bones");
    }
}
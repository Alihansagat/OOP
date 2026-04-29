public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void sound(){
        System.out.println("Gav");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void eat(String s){
        System.out.println("Dog is eating the " + s);
    }
}

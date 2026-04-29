public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal is: " + name);
    }

    public void sound(){
        System.out.println("Animal is sound");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void eat(String s){
        System.out.println("Animal is eating");
    }
}

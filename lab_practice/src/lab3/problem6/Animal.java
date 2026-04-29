package lab3.problem6;

public abstract class Animal implements Trainable{
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public void learnTrick(String trick){
        System.out.println(name + " learned: " + trick);
    }

    @Override
    public String toString(){
        return name + " (" + age + ") says " + getSound();
    }
}

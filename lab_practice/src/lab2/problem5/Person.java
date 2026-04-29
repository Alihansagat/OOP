package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet){
        this.pet = pet;
    }

    public Animal removePet(){
        Animal temp = pet;
        pet = null;
        return temp;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void leavePetWith(Person other){

            if(this.hasPet()){
                other.assignPet(this.pet);
                this.removePet();
            }





    }

    public void retrievePetFrom(Person other){

        if(!other.hasPet()){
            System.out.println("No pet to retrieve.");
            return;
        }

        assignPet(other.removePet());
    }

    public abstract String getOccupation();

    public String toString(){
        return name + " (" + getOccupation() + ")" +
                (pet == null ? " has no pet" : " owns " + pet);
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Person)) return false;
        Person p = (Person)o;
        return age == p.age && Objects.equals(name, p.name);
    }

    public int hashCode(){
        return Objects.hash(name, age);
    }
}

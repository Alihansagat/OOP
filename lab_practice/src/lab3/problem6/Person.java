package lab3.problem6;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Cloneable, PetCare {
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

    @Override
    public int compareTo(Person other){
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Person clone(){
        try{
            return (Person) super.clone();
        } catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public void feedPet(){
        if(pet != null){
            System.out.println(name + " feeds " + pet.name);
        } else {
            System.out.println(name + " has no pet to feed.");
        }
    }

    @Override
    public void playWithPet(){
        if(pet != null){
            System.out.println(name + " plays with " + pet.name);
        } else {
            System.out.println(name + " has no pet to play with.");
        }
    }

    @Override
    public String toString(){
        return name + " (" + getOccupation() + ")" +
                (pet == null ? " has no pet" : " owns " + pet);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Person)) return false;
        Person p = (Person)o;
        return age == p.age && Objects.equals(name, p.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}
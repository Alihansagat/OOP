package lab2.problem5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    public void printWithPets(){
        for(Person p : people){
            if(p.hasPet())
                System.out.println(p);
        }
    }

    public void printWithoutPets(){
        for(Person p : people){
            if(!p.hasPet())
                System.out.println(p);
        }
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        for(Person p : people){
            sb.append(p).append("\n");
        }

        return sb.toString();
    }
}

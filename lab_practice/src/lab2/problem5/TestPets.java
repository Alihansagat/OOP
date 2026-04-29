package lab2.problem5;

public class TestPets {

    public static void main(String[] args) {

        Person john = new Employee("John",30,"Engineer");
        Person alice = new PhDStudent("Alice",26,"CS","AI");

        Animal murka = new Dog("Murka",5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetWith(alice);

        System.out.println("After vacation start:");
        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println("After return:");
        System.out.println(registry);
    }
}
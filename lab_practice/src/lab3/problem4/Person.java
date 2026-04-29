package lab3.problem4;

public class Person {
    protected String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        Person other = (Person) obj;
        return name.equals(other.name);
    }
}
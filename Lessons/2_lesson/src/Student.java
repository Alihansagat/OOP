import java.util.Objects;

public class Student {

    private String name;
    private final int id;          // final field
    private double gpa;

    public static String universityName = "KBTU"; // static field

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getGpa() { return gpa; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return name + " " + id + " " + gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
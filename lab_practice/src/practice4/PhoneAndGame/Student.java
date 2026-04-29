package practice4.PhoneAndGame;

public class Student implements Comparable{
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa); // natural order by GPA
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

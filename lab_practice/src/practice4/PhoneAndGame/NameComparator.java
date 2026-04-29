package practice4.PhoneAndGame;

public class NameComparator extends Comparator{
    int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

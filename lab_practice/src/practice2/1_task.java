import practice2.Student;

class Stud {
    public static void main(String[] args) {
        Student student1 = new Student("Alikhan", 1983);
        Student student2 = new Student("Akezhan", 1999);

        student1.setYearOfStudy(2);
        student2.setYearOfStudy(2);

        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getYearOfStudy());
        student1.increaseYear_of_study();
        System.out.println(student1.getYearOfStudy());
    }
}
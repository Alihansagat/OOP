package practice2;

public class Student {
    private String name;
    private int id;
    private int year_of_study;
    private double grade;

    public Student(String n, int i) {
        name = n;
        id = i;
        year_of_study = 1;
        grade = 0.0;
    }

    public Student(String n, int i, double grade) {
        name = n;
        id = i;
        year_of_study = 1;
        this.grade = grade;
    }

    public Student(String n, int i, int year_of_study, double grade) {
        name = n;
        id = i;
        this.year_of_study = year_of_study;
        this.grade = grade;
    }

    public void setYearOfStudy(int y){
        year_of_study = y;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public char getLetterGrade() {
        if (grade >= 90) return 'A';
        else if (grade >= 80) return 'B';
        else if (grade >= 70) return 'C';
        else if (grade >= 60) return 'D';
        else return 'F';
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getYearOfStudy(){
        return year_of_study;
    }

    public void increaseYear_of_study(){
        year_of_study++;
    }
}
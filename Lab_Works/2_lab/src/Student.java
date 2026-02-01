public class Student {
    private String name;
    private String id;
    private int year_of_study;

    public Student(String n, String i) {
        name = n;
        id = i;
    }

    public void setYearOfStudy(int y){
        year_of_study = y;
    }

    public String getName(){
        return "Name of student - " + name;
    }
    public String getId(){
        return "Student's id - " + id;
    }
    public int getYearOfStudy(){
        return year_of_study;
    }

    public void increaseYear_of_study(){
        year_of_study++;
    }
}
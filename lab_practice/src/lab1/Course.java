package lab1;
import java.util.ArrayList;

public class Course {

    private String name;
    private String description;
    private int creditNum;
    private ArrayList<String> prereqs;

    public String getName() {
        return name;
    }

    public Course(String subjectName, String subjectDescription, int subjectCreditNum, ArrayList<String> subjectPrereq) {
        this.name = subjectName;
        this.description = subjectDescription;
        this.creditNum = subjectCreditNum;
        this.prereqs = subjectPrereq;
    }

    public void tooString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course name: ").append(name);
        sb.append(", Description: ").append(description);
        sb.append(", Credits: ").append(creditNum);
        sb.append(", Prerequisites: ");

        for (int i = 0; i < prereqs.size(); i++) {
            sb.append(prereqs.get(i));
            if (i < prereqs.size() - 1) sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
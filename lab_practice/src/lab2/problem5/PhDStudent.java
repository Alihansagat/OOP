package lab2.problem5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String topic){
        super(name, age, major);
        this.researchTopic = topic;
    }

    @Override
    public void assignPet(Animal pet){
        if(pet instanceof Dog){
            System.out.println("PhD students cannot take care of dogs.");
            return;
        }
        super.assignPet(pet);
    }

    public String getOccupation(){
        return "PhD student researching " + researchTopic;
    }
}

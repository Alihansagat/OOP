public class Robot {
    private String name;
    private String color;
    private int health;
    private int strength;

    public void setName(String n) {
        name = n;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setHealth(int h) {
        health = h;
    }

    public void setStrength(int s) {
        strength = s;
    }

    public String getName(){
        return name;
    }

    public void PrintParametrs(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
    }
}

class Robot {
    private String name = "Nick";
    private String color;

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String c) {
        color = c;
    }

    public Robot() {
        name= "Ben";
    }

    public Robot(String n) {
        name = n;
        System.out.printf("My name is - %s ", this);
    }

    public String toString() {
        return String.format("%s ", name);
    }

    public Robot(String n, String x) {
        name = n;
    }

    public void PrintParameters() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public String getName(){
        return name;
    }
}

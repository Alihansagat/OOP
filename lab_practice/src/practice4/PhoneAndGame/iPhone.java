package practice4.PhoneAndGame;

public class iPhone extends Device implements SellableAndPluggable{
    String name;
    public String getName() {
        return name;
    }
    public iPhone(String name) {
        this.name = name;
    }
}

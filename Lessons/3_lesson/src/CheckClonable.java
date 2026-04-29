public class CheckClonable implements Cloneable {
    int id;

    public CheckClonable(int id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

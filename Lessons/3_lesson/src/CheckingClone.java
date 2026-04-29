public class CheckingClone extends CheckClonable {
    public CheckingClone(int id) {
        super(id);
    }
    public static void  main(String[] args) throws CloneNotSupportedException{
        CheckClonable c1 = new CheckClonable(10);
        CheckClonable c2 = (CheckClonable) c1.clone();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.id == c2.id);
    }
}
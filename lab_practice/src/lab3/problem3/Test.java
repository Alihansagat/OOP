package lab3.problem3;

public class Test {
    public static void main(String[] args) {
        MyArrayCollection<String> collection = new MyArrayCollection<>();

        System.out.println("Is empty: " + collection.isEmpty());

        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");

        System.out.println("Size: " + collection.size());

        System.out.println("Contains Banana: " + collection.contains("Banana"));

        collection.remove("Banana");

        System.out.println("Contains Banana: " + collection.contains("Banana"));

        System.out.println("Size after remove: " + collection.size());

        collection.clear();

        System.out.println("Size after clear: " + collection.size());
        System.out.println("Is empty: " + collection.isEmpty());
    }
}
import lab2.problem1.Book;
import lab2.problem1.LibraryItem;

import java.util.Vector;

public class b {
    public static void main(String[] args) {
        LibraryItem book1 = new Book("Monday or Tuesday", "Virgina Woolf", 1921, 74);
        System.out.println(book1);
        System.out.println();

        LibraryItem book2 = new Book("Pride and Prejudice", "Jane Austen", 1813, 279);
        System.out.println(book2);
        System.out.println();

        Vector<Boolean> equalOrNot = new Vector<Boolean>();

        equalOrNot.add(book1.equals(book2));

        System.out.println(equalOrNot);
    }

}
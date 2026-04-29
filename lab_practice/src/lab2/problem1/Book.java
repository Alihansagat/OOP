package lab2.problem1;

import java.util.Objects;

public class Book extends LibraryItem {
    private int numberOfPages;
    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return "Title of book - " + super.getTitle() + ".\nAuthor of this book - " + super.getAuthor() + ".\nPublication year of this book - " + super.getPublicationYear() + ".\nPages of this book - " + numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;
        return numberOfPages == book.numberOfPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPages);
    }
}

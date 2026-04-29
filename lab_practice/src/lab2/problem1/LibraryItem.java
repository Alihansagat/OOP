package lab2.problem1;

import java.util.Objects;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString(){
        return "Title: " + title +  ", Author: " + author + ", Publication Year: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryItem)) return false;
        LibraryItem item = (LibraryItem) o;

        return publicationYear == item.publicationYear &&
                Objects.equals(title, item.title) &&
                Objects.equals(author, item.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

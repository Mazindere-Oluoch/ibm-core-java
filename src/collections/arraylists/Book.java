package collections.arraylists;

import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author, boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Bible", "Dennis the Black Jesus", true));
        books.add(new Book(2, "Dictionary", "Macmillan", false));
        books.add(new Book(3, "Poems", "Mazindere", false));
        books.add(new Book(4, "Things Fall Apart", "Chinua Achebe", true));
        books.add(new Book(5, "Gods must be crazy", "Huang", false));

        System.out.println("\nsize: " + books.size());
        System.out.println("Book details at index 0: " + books.get(0));

        System.out.println("\n" + books + "\n"); // prints all records as one array


        for (Book b : books) {
            System.out.println(b.toString());

        }

        books.remove(4);
        System.out.println("\nremoved element 5 \n");

        for (Book b : books) {
            System.out.println(b.toString());

        }


        System.out.println("size: " + books.size());

        System.out.println("**printing using for each**");
        books.forEach(b-> System.out.println(b));



    }

    // getters n setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String toString() {
        return id + ", " + title + ", " + author + ", " + isBorrowed;

    }
}

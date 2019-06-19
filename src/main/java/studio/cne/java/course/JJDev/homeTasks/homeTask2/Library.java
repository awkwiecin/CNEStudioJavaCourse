package studio.cne.java.course.JJDev.homeTasks.homeTask2;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<Book>();
    private String name;

    public Library(String name) {
        this.name = name;
    }

    public void receive(Book book) {
        books.add(book);
    }

    public void throwAway(Book book) {
        books.remove(book);
    }

    public void rent(String title) {

        for (int i = 0; i < this.books.size(); i++) {
            if (title.equals(this.books.get(i).getTitle())) {
                if (this.books.get(i).isRented() == false) {
                    this.books.get(i).setRented(true);
                    System.out.println("The book: " + this.books.get(i).getTitle() + " written by " + this.books.get(i).getAuthor() +
                            " is rented to You.");
                    break;
                } else {
                    System.out.println("!The book" + this.books.get(i).getTitle() + "is already rended!");
                }
            } else {
                continue;
            }
        }

    }

    public void receive(String title) {

        for (int i = 0; i < this.books.size(); i++) {
            if (title.equals(this.books.get(i).getTitle())) {
                if (this.books.get(i).isRented() == true) {
                    this.books.get(i).setRented(false);
                    System.out.println("The book " + this.books.get(i).getTitle() + " written by" + this.books.get(i).getAuthor() + "is back in library stock");
                    break;
                } else {
                    System.out.println("!The book " + this.books.get(i).getTitle() + " is already in library stock!");
                }
            } else {
                continue;
            }

        }
    }

    public void printLibraryStock() {
        for (int i = 0; i < this.books.size(); i++) {
            System.out.println(this.books.get(i).toString());
        }
    }


}

package studio.cne.java.course.JJDev.homeTasks.homeTask2;

public class Book {

    private String title;
    private String author;
    private int year;
    private String translator;
    private boolean rented;

    public Book(String title, String author, int year, String editor, boolean b) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.translator = translator;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getTranslator() {
        return translator;
    }

    public boolean isRented() {
        return rented;
    }
}

package Lesson11;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private int id;

    public Book(String author, String title, int yearOfPublication, int id) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

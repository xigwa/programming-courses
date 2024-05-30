package Lesson11;

import java.util.*;

public class Library {
    ArrayList<Book> libraryOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        libraryOfBooks.add(book);
    }
    public void removeBook(String titleOrAuthor) {
        for (int i = 0; i < libraryOfBooks.size(); i++) {
            if (libraryOfBooks.get(i).getTitle().equals(titleOrAuthor) || libraryOfBooks.get(i).getAuthor().equals(titleOrAuthor)) {
                Book removedBook = libraryOfBooks.get(i);
                libraryOfBooks.remove(i);
                System.out.println("Book \"" + removedBook.getTitle() + "\" removed.");
                return;
            }
        }
        System.out.println("Book \"" + titleOrAuthor + "\" not found.");
    }
    public void removeBook(int id) {
        for (int i = 0; i < libraryOfBooks.size(); i++) {
            if (libraryOfBooks.get(i).getId() == id) {
                Book removedBook = libraryOfBooks.get(i);
                libraryOfBooks.remove(i);
                System.out.println("Book \"" + removedBook.getTitle() + "\" removed.");
                return;
            }
        }
        System.out.println("ID " + id + " is not linked to any of the books.");
    }
    public static void countBooks(Library library) {
        System.out.println("Books in the library " + library.libraryOfBooks.size() + ".");
    }

    public void libPrint() {
        for (int i = 0; i < libraryOfBooks.size(); i++) {
            System.out.println("Title: " + libraryOfBooks.get(i).getTitle() + ", Author: " + libraryOfBooks.get(i).getAuthor() + ", Year: " + libraryOfBooks.get(i).getYearOfPublication() + ", ID: " + libraryOfBooks.get(i).getId() + ".");
        }
    }
}

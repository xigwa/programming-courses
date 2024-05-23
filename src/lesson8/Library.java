package lesson8;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book bookToRemove) {
        if (books.remove(bookToRemove)) {
            System.out.println("Book '" + bookToRemove.getTitle() + "' removed.");
        } else {
            System.out.println("Book '" + bookToRemove.getTitle() + "' not found.");
        }
    }

    public void printBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", published in " + book.getPublicationYear());
        }
    }
}
package lesson8;

public class lesson8 {
    public static void main(String[] args) {
    Library library = new Library();
    Book TheLordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkien","1954-1955");
    Book HarryPotter = new Book("Harry Potter", "J.K. Rowling","1997-2007");
    library.addBook(TheLordOfTheRings);
    library.addBook(HarryPotter);
    library.printBooks();
    library.removeBook(HarryPotter);
    library.printBooks();


    }
}

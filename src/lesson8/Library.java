package lesson8;

    class Library {
    public Book[] books;
    private int numberOfBooks;

        public Library() {
            this.books = new Book[10];
            this.numberOfBooks = 0;
        }



        public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    public void removeBook(Book bookToRemove) {
            for (int i = 0; i < numberOfBooks; i++) {
                if (books[i] == bookToRemove) {
                    books[i] = books[numberOfBooks - 1];
                    books[numberOfBooks - 1] = null;
                    numberOfBooks--;
                    return;
                }
            }
            System.out.println("Book '" + bookToRemove.getTitle() + "' not found.");
        }


        public void printBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + ", published in " + books[i].getPublicationYear());
        }
    }
}
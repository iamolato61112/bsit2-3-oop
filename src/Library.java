public class Library {

    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];  // Max 10 books in the library
        bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount < 10) {
            books[bookCount++] = book;
            return true;
        }
        return false;
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {

                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];  // Book found
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            return book.borrowBook();
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            return book.returnBook();
        }
        return false;
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
                System.out.println();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("All Books in the Library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
            System.out.println();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;
    private int Status;

    public Book(String title, String author, String isbn, int yearPublished) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setYearPublished(yearPublished);
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int Status() {
        return Status;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || (isbn.length() != 10 && isbn.length() != 13)) {
            throw new IllegalArgumentException("ISBN must be exactly 10 or 13 characters long");
        }
        this.isbn = isbn;
    }

    public void setYearPublished(int year) {
        int currentYear = 2025;
        if (year < 1450 || year > currentYear) {
            throw new IllegalArgumentException("Year must be between 1450 and " + currentYear);
        }
        this.yearPublished = year;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }


    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }


    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Status: " + Status);
    }
}

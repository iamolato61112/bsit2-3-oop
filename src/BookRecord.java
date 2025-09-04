public class BookRecord {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        book1.addRating(4);
        book1.addMultipleRatings(5, 4, 3, 5);

        book2.addMultipleRatings(5, 5, 4, 5, 4);
        book2.addRating(3);

        book3.addMultipleRatings(2, 1, 3, 2, 1);


        book3.addMultipleRatings(5, 6, 0, 4, 7, 3);
        System.out.println("====> Book Record System <====");

        // display sa mga book
        System.out.println("\nAll Book Details:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        // e show ang total books
        System.out.println("\nTotal books: " + Book.getTotalBooks());

        // book nga highest average rating
        Book highest = book1;
        if (book2.getAverageRating() > highest.getAverageRating()) highest = book2;
        if (book3.getAverageRating() > highest.getAverageRating()) highest = book3;
        System.out.println("\nHighest book:\n" + highest.displayBook());


    }
}
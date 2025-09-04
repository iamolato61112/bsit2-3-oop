import java.util.ArrayList;


class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int rating : ratings) sum += rating;
        return (double) sum / ratings.size();
    }

    public String getPopularityLevel(int i) {
        if (ratings.isEmpty()) return "No ratings";
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        if (avg >= 3.5) return "Good";
        if (avg >= 2.5) return "Average";
        if (avg >= 1.5) return "Poor";
        return "Terrible";
    }

    public void addMultipleRatings(int... ratings) {
        for (int rating : ratings) {
            try {
                addRating(rating);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid rating: must be 1-5 stars");
            }
        }
    }

    public static int getTotalBooks() { return totalBooks; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String displayBook() {
        return String.format("Book: %s by %s, Average Rating: %.1f, Level: %s",
                title, author, getAverageRating(), getPopularityLevel(1));
    }
}




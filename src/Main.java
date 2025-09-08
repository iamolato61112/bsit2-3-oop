import java.util.ArrayList;


class Food {

    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalFoods = 0;

    public Food(String title, String buyer) {
        this.title = title;
        this.author = buyer;
        this.ratings = new ArrayList<>();
        totalFoods++;
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
        if (ratings.isEmpty()) return "No items";
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        if (avg >= 3.5) return "Small";
        if (avg >= 2.5) return "Average";
        if (avg >= 1.5) return "Poor";
        return "Terrible";
    }

    public void addMultipleRatings(int... ratings) {
        for (int rating : ratings) {
            try {
                addRating(rating);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid price: must be greater than 0");
            }
        }
    }

    public static int getTotalFood() { return totalFoods; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String displayFood() {
        return String.format("Food: %s by %s, Average Rating: %.1f, Level: %s",
                title, author, getAverageRating(), getPopularityLevel(1));
    }
}





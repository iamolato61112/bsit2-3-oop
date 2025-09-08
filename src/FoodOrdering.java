import java.util.ArrayList;

public class FoodOrdering {
    public static void main(String[] args) {

        Food food1 = new Food("Order for", "Alice Johnson: 3 items");
        Food food2 = new Food("Order for", "Bob Smith: 5 items");
        Food food3 = new Food("Order for", "Charlie Brown: 2 items");

        food1.addRating(4);
        food1.addMultipleRatings(5, 4, 3, 5);

        food2.addMultipleRatings(5, 5, 4, 5, 4);
        food2.addRating(3);

        food3.addMultipleRatings(2, 1, 3, 2, 1);


        food3.addMultipleRatings(5, 6, 0, 4, 7, 3);
        System.out.println("====> Food Ordering System <====");

        // display sa mga food
        System.out.println("\nOrder Results:");
        System.out.println(food1.displayFood());
        System.out.println(food2.displayFood());
        System.out.println(food3.displayFood());

        // e show ang total foods
        System.out.println("\nTotal orders: " + Food.getTotalFood());

        // food nga highest average price
        Food highest = food1;
        if (food2.getAverageRating() > highest.getAverageRating()) highest = food2;
        if (food3.getAverageRating() > highest.getAverageRating()) highest = food3;
        System.out.println("\nLargest Order:\n" + highest.displayFood());


    }
}
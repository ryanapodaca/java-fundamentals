package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    float stars;
    String description;
    String dollarSigns;

    ArrayList<Review> totalReviews = new ArrayList<>();

    public Shop(String name, String description, String dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    @Override
    public String toString() {
        return "Shop\nname= " + name + "\nstars= " + stars + "\ndescription= " + description+ "\ndollarSigns= " + dollarSigns;
    }

    public void addReviewUpdateStars(Review review) {
        if(review instanceof TheaterReview){
            throw new IllegalArgumentException("Theater review is not allowed");
        }
        totalReviews.add(review);
        float acc = 0;
        for (Review r:totalReviews) {
            acc = (float)r.getRating() + acc;
        }
        stars = acc/totalReviews.size();
    }
}

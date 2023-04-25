package inheritance;

public class Review extends Restaurant {
    int rating;
    String body;
    String author;

    String restaurantName;

    public Review(int rating, String body, String author, String restaurantName) {
        this.rating = rating;
        this.body = body;
        this.author = author;
        this.restaurantName = restaurantName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }


}

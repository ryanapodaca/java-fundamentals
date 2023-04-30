package inheritance;

public class Review {
    int rating;
    String body;
    String author;

    String establishmentName;

    public Review(int rating, String body, String author, String establishmentName) {
            this.rating = rating;
            this.body = body;
            this.author = author;
            this.establishmentName = establishmentName;

    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating > 5 ||rating < 0){
            System.out.println("rating out of bounds");
            return;
        }
        this.rating = rating;
    }
}

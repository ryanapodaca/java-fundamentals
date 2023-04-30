package inheritance;

public class TheaterReview extends Review{
    String movie;

    public TheaterReview(int rating, String body, String author, String establishmentName, String movie) {
        super(rating, body, author, establishmentName);
        this.movie = movie;
    }
}

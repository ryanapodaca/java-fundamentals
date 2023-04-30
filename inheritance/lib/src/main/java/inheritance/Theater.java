package inheritance;

import java.util.ArrayList;

public class Theater {
    String name;
    float stars;

    ArrayList<String>allMovies = new ArrayList<>();

    ArrayList<Review> totalReviews = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Theater\nname= "+ name + "\nstars= " + stars;
    }

    public void addMovie(String movie){
        allMovies.add(movie);
    }

    public String removeMovie(String movie){
        for(String i : allMovies) {
            if (i.equals(movie)) {
                allMovies.remove(i);
                return movie + " removed.";
            }
        }
        return movie + " not at theater.";
    }

    public void addReviewUpdateStars(Review review) {
        totalReviews.add(review);
        float acc = 0;
        for (Review r:totalReviews) {
            acc = (float)r.getRating() + acc;
        }
        stars = acc/totalReviews.size();
    }

    public String getAllMovies() {
        String moviesString ="";
        for(String movie: allMovies){
            moviesString = moviesString.concat(movie + "\n");
        }
        return moviesString;
    }
}

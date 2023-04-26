package inheritance;

import java.util.Arrays;

public class Theater {
    String name;
    String[] movies;

    public Theater(String name, String[] movies) {
        this.name = name;
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + Arrays.toString(movies) +
                '}';
    }


}

package cinema;

import java.util.ArrayList;

public class MoviesLibrary {

    private static ArrayList<Movie> movies = new ArrayList<>();

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public static void setMovies(ArrayList<Movie> movies) {
        MoviesLibrary.movies = movies;
    }

    public static void addMovieToLibrary(Movie movie) {
        movies.add(movie);
    }

    public static void printLibrary() {
        System.out.println("Movies in library are:");
        for (Movie movie : movies) {
            System.out.println(movie);

        }
    }

}

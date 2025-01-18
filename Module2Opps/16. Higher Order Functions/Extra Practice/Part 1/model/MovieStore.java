package model;
import java.util.*;

public class MovieStore {
    private List<Movie> movies;


    public MovieStore(){
        this.movies=new ArrayList<>();
    }


    public void addMovie(Movie movie){
        this.movies.add(new Movie(movie));
    }

    public List<Movie> filterByGenre(String gen){
        
         List<Movie> list= this.movies.stream().filter(x->x.getGenre().equals(gen)).toList();
        return list;
        }


        // public List<Movie>   sortByReleaseYear (){
        //     List<Movie> list= this.movies.stream().sorted((x,y)-> x.getReleaseYear().compareTo(y.getReleaseYear()).toList());
        //     return list;
        // }

        public List<Movie> sortByReleaseYear() {
         return this.movies.stream()
                    .sorted((x, y) ->Integer.compare(x.getReleaseYear(), y.getReleaseYear()))
                    .toList();
        }


           public List<Movie> getTopRatedMovies (int n) {
         return this.movies.stream()
                    .sorted((x, y) ->Double.compare( y.getRating(),x.getRating()))
                    .limit(n)
                    .toList();
        }

}   

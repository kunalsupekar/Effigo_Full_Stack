import java.util.Arrays;

public class Store {

    Movie movies [];
    public Store(Movie[] movie) {
        // TODO
        this.movies=new Movie[movie.length];
    }


    public Movie getMovie(int index) {
        // TODO 
        Movie copyMovie=new Movie(movies[index]);
        return copyMovie;
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index]=new Movie(movie);
    }


    @Override
    public String toString() {

        System.out.println("call coming");
        String temp="";
        for(Movie m:movies){
            temp+=m.toString()+"\n";
        }
        return temp;
    }
}

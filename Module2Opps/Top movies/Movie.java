public class Movie {
    private String name;
    private String format;
    private double rating;


    
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    //copy constructor
    public Movie(Movie copyMovies){
        this.name=copyMovies.name;
        this.format=copyMovies.format;
        this.rating=copyMovies.rating;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    
    }


    
    
}

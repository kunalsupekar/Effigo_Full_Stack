import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        
        Movie[] movies = {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        Store store=new Store(movies);
        
        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        Movie test=store.getMovie(3);
        System.out.println("******************************MOVIE STORE*****************************");
        System.out.println(store);
        String choise;
        Scanner scan=new Scanner(System.in);
        System.out.print("To edit another rating, type: 'continue':");
        choise=scan.next();
        while(choise.equals("continue")){
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int index=scan.nextInt();
            index--;
            Movie movie1=store.getMovie(index);
            System.out.print("Set a new rating for " +movie1.getName()  + ": ");
            double newRating=scan.nextDouble();
            movie1.setRating(newRating);
            store.setMovie(index, movie1);
            System.out.println(store);
            System.out.print("To edit another rating, type: 'continue':");
            choise=scan.next();
            if(!choise.equals("continue")){
                break;
            }
        }
        

    
        
    }
}

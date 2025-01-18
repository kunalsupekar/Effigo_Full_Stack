import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        
        List<String> upperCaseNames=usernames.stream().map(username ->  username.toUpperCase()).toList();
        // *******************toList*******************
        // List<String> upperUsernames;
        System.out.println(upperCaseNames);


        // *******************reduce*******************

        List<Integer> earnings = Arrays.asList(1,2,3,4,5);
         Integer totalEarnings = earnings.stream().reduce(1,(x,y)->x*y);
         System.out.println(totalEarnings);


        // *******************reduce*******************

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        // Double fundsRemaining = 
        
       // System.out.println("\nYou still have $<fundsRemaining");
       
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");
    
        String result=aisles.stream()
        .filter(x-> x.equals("coffee"))
        .findFirst()
        .orElse(null);

        System.out.println(result == null ? "no we dont !": "YES WE DO");

        //System.out.println("Sure we do! No we don't!");
        
        
        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1,1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 1 repeat?");
        // int count = 

        long resu=numbers.stream().filter(x-> x==1).count();
        System.out.println(resu);

        System.out.println("The number 1 repeats <count> times");
        
    }   
    
}


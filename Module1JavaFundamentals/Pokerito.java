import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        // System.out.println(generateRandomNumber());
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        sc.nextLine();
        System.out.println("It's like Poker, but a lot simpler");
        System.out.println("  >> There are two players, you and the computer");
        System.out.println(">>The dealer will give each player one card.");
        System.out.println(">> Then, the dealer will draw five cards (the river)");
        System.out.println(" >> The player with the most river matches wins!");
        System.out.println(" >>  If the matches are equal, everyone's a winner!");
        System.out.println(">>  Ready? Type anything if you are.");
        sc.nextLine();
        /*
         * Task 3: Present the user with a card
         * println 'Here's your card:'
         * <show card>
         * <new line>
         * println 'Here's the computer's card:'
         * <show computer's card>
         */
        System.out.println("println 'Here's your card:'");
        String yourCard=generateRandomNumber();
        System.out.println(yourCard);
        System.out.println("Here's the computer's card:");
        String computerCard=generateRandomNumber();
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches = 0;
       
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        sc.nextLine();
        // System.out.println("card1");
        for (int i = 1; i <= 5; i++) {
            System.out.println("card " + i);
           
            String draw = generateRandomNumber();
            if(draw.equals(computerCard)) computerMatches++;
            if(draw.equals(yourCard)) yourMatches++;
            System.out.println(draw);

        }
        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

        System.out.println("Your number of Matches "+yourMatches);
        System.out.println("Computer number of Matches "+computerMatches);
        if(yourMatches>computerMatches){
            System.out.println("You WIN!");
        }else if(computerMatches>yourMatches){
            System.out.println("Computer wins");

        }else{
            System.out.println("Everyone wins!");
        }
    }

    public static String generateRandomNumber() {

        int number = (int) ((Math.random() * 10) + 1);
        switch (number) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";

            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return

                "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            default:
                return "";

        }

    }

}

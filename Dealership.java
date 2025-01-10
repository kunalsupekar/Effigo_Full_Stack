import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();


        switch(option){
            case "a":
            System.out.println("you chose option " + option);
            System.out.println("What is your budget?");
            int budjet=scan.nextInt();

            if(budjet<10000){
                System.out.println("budget greater than or equal to 10000");
            }else{
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                scan.nextLine();
                String insurace=scan.nextLine();
                System.out.println("\nDo you have a license? Write 'yes' or 'no'");
               //aa scan.nextLine();
                String license = scan.nextLine();
                System.out.println("What is your credit score?");
                int creditScore = scan.nextInt();
                if(insurace.equals("yes") && license.equals("yes")&& creditScore>660){
                    System.out.println("Sold! Pleasure doing business with you");
                }else{
                    System.out.println("We're sorry. You are not eligible");
                }
            }
            break;
            case "b":
            System.out.println("you chose option " + option);
            break;
            default:
            System.out.println("invalid option " + option);

        }
       
        

        scan.close();
        }
}

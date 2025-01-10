import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("What is your name?");
        String name=sc.nextLine();

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice=sc.nextDouble();

        System.out.println("How much money do you spend on fast food?");
        double foodPrice=sc.nextDouble();


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount=sc.nextInt();

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount=sc.nextInt();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you "+name+" for answering all <counter> questions");
        System.out.println("Weekly, you spend "+(coffeePrice*coffeeAmount)+" on coffee");
        System.out.println("Weekly, you spend "+(foodAmount*foodPrice)+" on food");

    }
}

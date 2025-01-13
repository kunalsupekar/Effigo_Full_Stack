public class LogicalOperators {
    public static void main(String[] args) {

        /**********************AND OPERATOR**********************/

        boolean hasDrivingLicense = true;
        boolean hasInsurance = true;

        if(hasDrivingLicense && hasInsurance){
            System.out.println("You can legally drive.");
        }else{
            System.out.println("You cannot legally drive.");
        }
        // has License and Insurance: System.out.println("You can legally drive.");
        // otherwise: System.out.println("You cannot legally drive.");

        int age = 25;
        double income = 45000;

        if(age>=21 && income >=40000){
            System.out.println("You are eligible for a loan.");
        }else{
            System.out.println("You are not eligible for a loan.");
        }
        // is at least 21 and has an income of at least 40000 : System.out.println("You are eligible for a loan.");
        // otherwise: System.out.println("You are not eligible for a loan.");


        String inputUsername = "JohnDoe";
        String inputPassword = "password123";

        String correctUsername = "JohnDoe";
        String correctPassword = "password123";

        if(inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)){
            System.out.println("Access granted!");
        }else{
            System.out.println("Invalid username or password");
        }
        // the inputted username and password are correct: System.out.println("Access granted!");
        // otherwise: System.out.println("Invalid username or password");

        /**********************OR OPERATOR**********************/

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;
        if(hasGoodPerformance || isLongTermEmployee){
            System.out.println("The user is eligible for a promotion.");
        }else{
            System.out.println("The user is not eligible for a promotion.");
        }
        // good performance or is a long term employee: System.out.println("The user is eligible for a promotion.");
        // otherwise: System.out.println("The user is not eligible for a promotion.");


    }
}

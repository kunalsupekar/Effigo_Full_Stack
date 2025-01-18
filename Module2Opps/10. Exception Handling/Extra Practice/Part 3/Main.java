import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    }

    public static boolean isNullOrBlank(String input) {
        // TODO
        return input==null || input.isBlank();
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        // TODO
        return issueNumber<=0;
    }

    public static boolean incorrectPublicationYear(int publicationYear) {
        // TODO
        return publicationYear<=0;
    }

    public static String promptForTitle(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid title: ");
        
        String title = scanner.nextLine();
        if(!isNullOrBlank(title)) {
            return title;
        }
        
        // TODO
    }
}
public static String promptForPublisher(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid publisher: ");
        String publisher = scanner.nextLine();
        if(!isNullOrBlank(publisher)){
            return publisher;
        }
       
        // TODO
    }
}

public static int promptForIssueNumber(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid issue number (greater than 0): ");
        // First check if the next input is not an integer
        if(!scanner.hasNextInt()){
            scanner.next();
            continue;
        }
              // scanner.next();
              // continue;
        
        int issueNumber = scanner.nextInt();
        if(incorrectIssueNumber(issueNumber)) continue;
        return issueNumber;
        // TODO
    }
}

public static int promptForPublicationYear(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid publication year (greater than 0): ");
        if(!scanner.hasNextInt()){
            scanner.next();
            continue;
        }
        int publicationYear = scanner.nextInt();
        if(incorrectPublicationYear(publicationYear)) continue;

        return publicationYear;
        // TODO
    }
}
}
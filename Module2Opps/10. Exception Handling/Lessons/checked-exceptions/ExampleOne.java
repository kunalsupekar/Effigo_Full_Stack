import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {

        try{
          FileInputStream fis = new FileInputStream("greetings.txt");
        Scanner scanner = new Scanner(System.in);
        // System.out.println(scanner.nextLine());
        int a=scanner.nextInt();
        // scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }finally{
            System.out.println("process complete!");
        }
        
    }
    
}
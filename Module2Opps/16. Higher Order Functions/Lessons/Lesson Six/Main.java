import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};

        Arrays.stream(greetings).forEach(x-> System.out.println(x));
        // Creating Stream from Datasource: File
        try{
            sample();
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
       
    }

    public static void sample() throws IOException{
        Path path = Paths.get("chorus.txt");
        Files.lines(path).forEach(x->System.out.println(x));
    }
}
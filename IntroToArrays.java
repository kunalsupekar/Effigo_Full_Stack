import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {
       
        String [] kingdoms={"mumbai","pune","karnataka","delhi"};
        System.out.println(Arrays.toString(kingdoms));

        String []menu=Arrays.copyOf(kingdoms, kingdoms.length);
        menu[1]="kunal";

        System.out.println(Arrays.toString(menu));
    }
}
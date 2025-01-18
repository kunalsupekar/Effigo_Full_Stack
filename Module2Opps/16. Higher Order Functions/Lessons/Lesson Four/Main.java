import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream().filter(price -> price>100).map(price-> price+10)
        .sorted((left,right)-> left.compareTo(right)).map(x-> "$"+x).map(price->price).forEach(i->{
            System.out.println(i);
        });
        //System.out.println(a.toString());

    }
}
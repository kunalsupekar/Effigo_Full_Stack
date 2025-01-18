import product.Shirt;
import product.Shirt.Size;
import product.*;
public class Main {

    public static void main(String[] args) {

        Shirt shirt=new Shirt(21.2,"white","nike",Size.SMALL);
        shirt.fold();
        shirt.wear();

    }

    public static void productStore(Product p){
        System.out.println("thankyou for purchasing pant "+p.getBrand()+"  scc "+p.getClass().getSimpleName() +" your total is "+p.getPrice());
    }

}

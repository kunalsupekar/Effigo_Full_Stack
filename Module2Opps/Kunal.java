
public class Kunal {
    public static void main(String[] args) {
        
        Car nissan =new Car("Nissan","balck",1234.1,2024);
        // nissan.make="Nissan";
        // nissan.color="blue";
        // nissan.price=10002.2;
        // nissan.year=2020;

        Car dodge =new Car("Toyata","white",212.1,1991);
        // dodge.make="Dodge";
        // dodge.color="Red";
        // dodge.price=12112.2;
        // dodge.year=2001;


        System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
    }
}

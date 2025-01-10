public class TypeCasting {
    
    public static void main(String[] args) {
        

        int a=10;
        int b=3;


        //typecasting to double
        System.out.println((double)a/b);

        System.out.println(2.0/5);

        double sales = 24309.65;
        double profit = 18562.18;
        double refunds= 688.78;
        //double shipping= 1233.57;

        int sale=(int) sales;
        int prof=(int) profit;
        int ref=(int) refunds;
     //   int shipp=(int) shipping;
        System.out.println( "sales : "+sale +" profit : "+prof+"refunds :"+ref);



    }
}

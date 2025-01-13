public class Parameter {
    public static void main(String[] args) {
        //calculateArea(2.3, 4.5);
        System.out.println(fahrenheitToCelsius(61));
    }

    /**
     * 
     * Kunal Supekar.
     * @PUNE
     * 
     */
    public static void calculateArea (double length,double width) {

        System.out.println("Area :" +length*width);
    }

    public static double fahrenheitToCelsius(double F){
       double C = (F - 32) * 5/9;
        return C;
    }
}

package product;

public class Pants extends Product {

    private int waist;
    private int length;
    

    public int getWaist() {
        return this.waist;
    }

    public Pants(double price, String color, String brand,int waist, int length) {
        //super(length, getColor(), getBrand());
        super(price, color, brand)  ;
        this.waist = waist;
        this.length = length;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void wear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wear'");
    }

   

}

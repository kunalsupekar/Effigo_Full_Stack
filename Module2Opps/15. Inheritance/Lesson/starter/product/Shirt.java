package product;

public class Shirt extends Product {

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Fold shirt : lie it on bed ");
    }
    @Override
    public void wear(){
        throw new UnsupportedOperationException("Unimplemented method 'wear'");

    }


}

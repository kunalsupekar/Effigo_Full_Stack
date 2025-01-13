import java.util.Arrays;

public class Car {
    private String make;

    private String color;
    private double price;
    private int year;
    private String[] spareParts;

    public Car(String make1, double price, int year, String color, String[] spareParts) {
        this.make = make1;
        this.color = color;
        this.price = price;
        this.year = year;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    // copy constructor
    public Car(Car car) {
        this.make = car.make;
        this.color = car.color;
        this.price = car.price;
        this.year = car.year;
        this.spareParts = Arrays.copyOf(car.spareParts, car.spareParts.length);
    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getSpareParts() {
        return Arrays.copyOf(this.spareParts, this.spareParts.length);
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    @Override
    public String toString() {
        return "Car [make=" + this.make + ", color=" + color + ", price=" + price + ", year=" + year + ", spareParts="
                + Arrays.toString(spareParts) + "]";
    }

    public void drive() {
        System.out.println(
                "You brought a beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price);
        System.out.println("Please drive it to the nearest exit");
    }

    // public String toString() {
    // return "kunal";
    // }
}

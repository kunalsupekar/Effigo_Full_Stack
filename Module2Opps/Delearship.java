import java.util.Arrays;

public class Delearship {
    

    private Car[] cars;

    public void sellCar(int index){
        this.cars[index].drive();
    }

    public int numberOfCars(){
       return  this.cars.length;
       // return 0;
    } 


    public Delearship(Car[] cars){
        //this.cars=Arrays.copyOf(car,car.length);
        this.cars=new Car[cars.length];
        for(int i=0;i<cars.length;i++){
            this.cars[i]=new Car(cars[i]);
        }
    }

    
    public Car getCar(int index){
        Car copy=new Car(this.cars[index]);
        return copy;

    }

    public void setCar(int index,Car newCar){
        Car copy=new Car(newCar);
        this.cars[index]=copy;
    }

   

   // @override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}

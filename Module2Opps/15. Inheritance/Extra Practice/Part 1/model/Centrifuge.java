package model;

public class Centrifuge  extends LabEquipment{
    private int maxRPM;


    private static final int minRPM=500;

    public  Centrifuge(String manufacturer, String model, int year,int maxRPM){
        super(manufacturer,model,year);
        setMaxRPM(maxRPM);
    }
    public  Centrifuge(Centrifuge source){
        super(source);
        setMaxRPM(source.maxRPM);
    }



    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM<minRPM){
            throw new IllegalArgumentException("RPM must be greater than or equal to the 500");
        }
        this.maxRPM = maxRPM;
    }
    @Override
    public String performMaintenance() {
        // TODO Auto-generated method stub
        return "implemented method 'performMaintenance";
    }
    @Override
    public LabEquipment clone() {
        return new Centrifuge(this);
    }
}

package model;

public abstract class LabEquipment {

    private String manufacturer;
    private String model;
    private int year;


    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }
    public LabEquipment(LabEquipment source){
        setManufacturer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }

    
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        if(manufacturer==null || manufacturer.isBlank()){
            throw new IllegalArgumentException("manufacture cannot be null and Blank ");
        }
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public abstract String performMaintenance ();
    public abstract LabEquipment clone();

}
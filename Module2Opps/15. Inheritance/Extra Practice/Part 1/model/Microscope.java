package model;

public class Microscope extends LabEquipment {

    private int magnification;
    private static final int minimumMagnification = 1;

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope sc) {
        super(sc);
        setMagnification(sc.magnification);
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {

        if (magnification < minimumMagnification) {
            throw new IllegalArgumentException(
                    "Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    }
}

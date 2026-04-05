package LabAssignments.Assignment3;

public abstract class HomeAppliances {

    private String brand;
    private int powerConsumption;
    private boolean isOn;

    public HomeAppliances(String brand, int powerConsumption, boolean isOn) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isOn = isOn;
    }

    public String getBrand() {
        return brand;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public abstract void performMainFunction();
    public abstract void showApplianceDetails();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public void checkStatus() {
        if (isOn)
            System.out.println("Appliance is On");
        else
            System.out.println("Appliance is Off");
    }

    public final void showSafetyInstructions() {
        System.out.println("Don't use Appliance with wet hands");
    }
}

package LabAssignments.Assignment3;

public class WashingMachine extends HomeAppliances {
    private int loadCapacity;
    private String washMode;
    public WashingMachine(String brand,int powerConsumption,boolean isOn,int loadCapacity,String washMode){
        super(brand, powerConsumption, isOn);
        setWashMode(washMode);
        setLoadCapacity(loadCapacity);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if(loadCapacity<0)
            this.loadCapacity=7;
        else
            this.loadCapacity = loadCapacity;
    }

    public String getWashMode() {
        return washMode;
    }
    public void setWashMode(String washMode){
        if(washMode == null || washMode.isEmpty()){
            this.washMode = "Normal";
        } else {
            this.washMode = washMode;
        }
    }
    @Override
    public void performMainFunction(){
        System.out.println("Washing clothes using " + washMode + " mode");
    }
    @Override
    public void showApplianceDetails(){
        System.out.println("Washing Machine Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Wash Mode: " + washMode);
    }
    @Override
    public String toString(){
        return "WASHING MACHINE" +
                "\nBrand: " + brand +
                "\nPower Consumption: " + powerConsumption +
                "\nStatus: " + (isOn ? "ON" : "OFF") +
                "\nLoad Capacity: " + loadCapacity +
                "\nWash Mode: " + washMode;
    }
}

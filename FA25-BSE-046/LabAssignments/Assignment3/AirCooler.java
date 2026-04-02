package LabAssignments.Assignment3;

public class AirCooler extends HomeAppliances{
    private int waterLevel;
    private int fanSpeed;
    public AirCooler(String brand, int powerConsumption, boolean isOn,int waterLevel,int fanSpeed){
        super(brand, powerConsumption, isOn);
        setFanSpeed(fanSpeed);
        setWaterLevel(waterLevel);
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        if(waterLevel<0)
            this.waterLevel=50;
        else
          this.waterLevel = waterLevel;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        if(fanSpeed<0)
            this.fanSpeed=1;
        else
            this.fanSpeed = fanSpeed;
    }

    @Override
    public  void performMainFunction(){
        System.out.println("Cooling air at fan speed of "+ fanSpeed);

    }
    @Override
    public void showApplianceDetails() {
        System.out.println("Air Cooler Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        System.out.println("Fan Speed: " + fanSpeed);
        System.out.println("Water Level" + waterLevel+" %");

    }
    @Override
    public String toString() {
        return "Air Cooler" +
                "\nBrand: " + brand +
                "\nPower Consumption: " + powerConsumption +
                "\nStatus: " + (isOn ? "ON" : "OFF") +
                "\nFan Speed: " + fanSpeed+
                "\nWater Level: " + waterLevel;
    }
}

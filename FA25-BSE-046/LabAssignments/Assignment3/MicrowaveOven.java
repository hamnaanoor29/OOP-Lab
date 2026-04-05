package LabAssignments.Assignment3;

public class MicrowaveOven extends HomeAppliances {
    private int timer;
    private int temperature;

    public MicrowaveOven(String brand, int powerConsumption, boolean isOn, int timer, int temperature) {
        super(brand, powerConsumption, isOn);
        setTemperature(temperature);
        setTimer(timer);
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        if (timer < 0)
            this.timer = 5;
        else
            this.timer = timer;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature < 0)
            this.temperature = 1000;
        else
            this.temperature = temperature;
    }

    @Override
    public void performMainFunction() {
        System.out.println("Heating food for " + timer + " minutes at " + temperature + " °C");
    }

    @Override
    public void showApplianceDetails() {
        System.out.println("Microwave Oven Details:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Power Consumption: " + getPowerConsumption());
        System.out.println("Status: " + (isOn() ? "ON" : "OFF"));
        System.out.println("Timer: " + timer);
        System.out.println("Temperature: " + temperature);
    }

    @Override
    public String toString() {
        return "Microwave Oven" +
                "\nBrand: " + getBrand() +
                "\nPower Consumption: " + getPowerConsumption() +
                "\nStatus: " + (isOn() ? "ON" : "OFF") +
                "\nTimer: " + timer +
                "\nTemperature: " + temperature;
    }
}

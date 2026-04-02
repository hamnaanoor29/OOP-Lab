package LabAssignments.Assignment3;

public class Main {
    public static void main(String[] args) {

        HomeAppliances wm = new WashingMachine("LG", 800, true, 7, "Quick Wash");
        HomeAppliances microwave = new MicrowaveOven("Samsung", 1200, false, 5, 200);
        HomeAppliances ac = new AirCooler("Orient", 150, true, 50, 3);
        HomeAppliances wm2 = new WashingMachine("Samsung", 750, false, 6, "Normal");
        HomeAppliances ac2 = new AirCooler("Voltas", 130, true, 30, 2);

        HomeAppliances[] appliances = {wm, microwave, ac, wm2, ac2};

        System.out.println("---- Appliances Before Modification ----");
        for(HomeAppliances appliance : appliances) {
            System.out.println(appliance.toString());
            System.out.println();
        }

        for(HomeAppliances appliance : appliances) {
            if(appliance instanceof WashingMachine) {
                ((WashingMachine) appliance).setLoadCapacity(
                        ((WashingMachine) appliance).getLoadCapacity() + 1
                );
            }
            else if(appliance instanceof AirCooler) {
                ((AirCooler) appliance).setFanSpeed(
                        ((AirCooler) appliance).getFanSpeed() + 1
                );
            }
        }

        for(HomeAppliances appliance : appliances) {
            if(appliance instanceof MicrowaveOven) {
                MicrowaveOven mw = (MicrowaveOven) appliance;
                if(mw.getTimer() < 10) {
                    mw.setTimer(mw.getTimer() + 2);
                }
            }
        }


        System.out.println("---- Appliances After Modification ----");
        for(HomeAppliances appliance : appliances) {
            appliance.displayBrand();
            appliance.checkStatus();
            appliance.performMainFunction();
            appliance.showApplianceDetails();
            appliance.showSafetyInstructions();
            System.out.println("-----------------------------------");
        }
    }
}
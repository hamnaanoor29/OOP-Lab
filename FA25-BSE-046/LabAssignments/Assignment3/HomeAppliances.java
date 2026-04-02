package LabAssignments.Assignment3;

public abstract class HomeAppliances {
    protected String brand;
    protected int powerConsumption;
    protected boolean isOn;
   public  HomeAppliances(String brand,int powerConsumption,boolean isOn){
        this.brand=brand;
        this.powerConsumption=powerConsumption;
        this.isOn=isOn;
    }
    abstract void performMainFunction();
    abstract void showApplianceDetails();
    public void displayBrand(){
        System.out.println("Brand: "+brand);
    }
    public void checkStatus(){
        if(isOn)
            System.out.println("Appliance is On");
        else
            System.out.println("Appliance is Off");
    }
    public final void showSafetyInstructions(){
        System.out.println("Don't use Appliance with wet hands");
    }
}

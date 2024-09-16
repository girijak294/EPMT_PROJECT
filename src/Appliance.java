class Appliance {
    private String name;
    private int powerConsumption;
    private boolean isOn;

    
    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isOn = false; // Default state is "off"
    }

   
    public void switchOn() {
        isOn = true;
    }

   
    public void switchOff() {
        isOn = false;
    }

    
    public boolean isOn() {
        return isOn;
    }

    
    public String getName() {
        return name;
    }

    
    public int getPowerConsumption() {
        return powerConsumption;
    }
}



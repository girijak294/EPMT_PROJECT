
class Home {
    private Appliance[] appliances;
    private int applianceCount;

    
    public Home(int size) {
        appliances = new Appliance[size];
        applianceCount = 0;
    }

    // Add an appliance to the home
    public void addAppliance(Appliance appliance) {
        if (applianceCount < appliances.length) {
            appliances[applianceCount++] = appliance;
        }
    }

    // Calculate the total power consumption of switched-on appliances
    public int calculateCurrentLoad() {
        int totalPower = 0;
        for (int i = 0; i < applianceCount; i++) {
            if (appliances[i].isOn()) {
                totalPower += appliances[i].getPowerConsumption();
            }
        }
        return totalPower;
    }

    // Sort appliances by the given parameter (name or power consumption)

    public void sortAppliances(String sortBy) {
        for (int i = 0; i < applianceCount - 1; i++) {
            for (int j = 0; j < applianceCount - i - 1; j++) {
                if (sortBy.equals("name") && appliances[j].getName().compareTo(appliances[j + 1].getName()) > 0) {
                    Appliance temp = appliances[j];
                    appliances[j] = appliances[j + 1];
                    appliances[j + 1] = temp;
                } else if (sortBy.equals("power") && appliances[j].getPowerConsumption() > appliances[j + 1].getPowerConsumption()) {
                    Appliance temp = appliances[j];
                    appliances[j] = appliances[j + 1];
                    appliances[j + 1] = temp;
                }
            }
        }
    }

    
    public void displayAppliances() {
        System.out.println("Appliances in the home:");
        for (int i = 0; i < applianceCount; i++) {
            System.out.println(appliances[i].getName() + " - " + appliances[i].getPowerConsumption() + " units");
        }
    }
}

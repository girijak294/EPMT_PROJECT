
public class PowerManagement {
   
	public static void main(String[] args) {
        // Create a Home object with a maximum of 4 appliances
        Home home = new Home(4);

        // Add appliances to the home
        Fan fan = new Fan();
        Light light = new Light();
        TV tv = new TV();
        Laptop laptop = new Laptop();

        home.addAppliance(fan);
        home.addAppliance(light);
        home.addAppliance(tv);
        home.addAppliance(laptop);

        // Switch on some appliances
        fan.switchOn();
        tv.switchOn();

        // Calculate and display current power consumption
        System.out.println("Current power consumption: " + home.calculateCurrentLoad() + " units");

        // Sort appliances by name
        System.out.println("\nAppliances sorted by name:");
        home.sortAppliances("name");
        home.displayAppliances();

        // Sort appliances by power consumption
        System.out.println("\nAppliances sorted by power consumption:");
        home.sortAppliances("power");
        home.displayAppliances();
    }
}

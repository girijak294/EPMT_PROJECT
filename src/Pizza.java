class Pizza {
    private PizzaBase base;
    private Toppings topping1;
    private Toppings topping2;
    private Toppings topping3;

    public Pizza(PizzaBase base) {
        this.base = base;
    }

    public void addTopping1(Toppings topping) {
        this.topping1 = topping;
    }

    public void addTopping2(Toppings topping) {
        this.topping2 = topping;
    }

    public void addTopping3(Toppings topping) {
        this.topping3 = topping;
    }

    public double calculateCost() {
        double totalCost = base.getPrice();
        
        if (topping1 != null) totalCost += topping1.getPrice();
        if (topping2 != null) totalCost += topping2.getPrice();
        if (topping3 != null) totalCost += topping3.getPrice();
        
        return totalCost;
    }

    
    public void showPizzaDetails() {
        System.out.println("Pizza Base: " + base.getName());
        System.out.print("Toppings: ");
        if (topping1 != null) System.out.print(topping1.getName() + " ");
        if (topping2 != null) System.out.print(topping2.getName() + " ");
        if (topping3 != null) System.out.print(topping3.getName() + " ");
        System.out.println("\nTotal Cost: $" + calculateCost());
    }
}
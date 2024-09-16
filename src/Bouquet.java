
class Bouquet {
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;

    
    public Bouquet() {
        
    }

    
    public void addFlower1(Flower flower) {
        this.flower1 = flower;
    }

    public void addFlower2(Flower flower) {
        this.flower2 = flower;
    }

    public void addFlower3(Flower flower) {
        this.flower3 = flower;
    }

    public double calculateCost() {
        double totalCost = 0.0;

        if (flower1 != null) totalCost += flower1.getPrice();
        if (flower2 != null) totalCost += flower2.getPrice();
        if (flower3 != null) totalCost += flower3.getPrice();

        return totalCost;
    }

    
    public void showBouquetDetails() {
        System.out.println("Bouquet contains:");
        if (flower1 != null) System.out.println(flower1.getName() + " - $" + flower1.getPrice());
        if (flower2 != null) System.out.println(flower2.getName() + " - $" + flower2.getPrice());
        if (flower3 != null) System.out.println(flower3.getName() + " - $" + flower3.getPrice());

        System.out.println("Total cost: $" + calculateCost());
    }
}

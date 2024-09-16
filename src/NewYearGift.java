
class NewYearGift {
    private Chocolate[] chocolates;
    private Sweet[] sweets;
    private int chocolateCount;
    private int sweetCount;

    // Constructor with fixed sizes for chocolates and sweets
    public NewYearGift(int chocolateSize, int sweetSize) {
        chocolates = new Chocolate[chocolateSize];
        sweets = new Sweet[sweetSize];
        chocolateCount = 0;
        sweetCount = 0;
    }

    // Method to add chocolates to the gift
    public void addChocolate(Chocolate chocolate) {
        if (chocolateCount < chocolates.length) {
            chocolates[chocolateCount++] = chocolate;
        }
    }

    // Method to add sweets to the gift
    public void addSweet(Sweet sweet) {
        if (sweetCount < sweets.length) {
            sweets[sweetCount++] = sweet;
        }
    }

    // Method to calculate the total weight of the gift
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < chocolateCount; i++) {
            totalWeight += chocolates[i].getWeight();
        }
        for (int i = 0; i < sweetCount; i++) {
            totalWeight += sweets[i].getWeight();
        }
        return totalWeight;
    }

    // Method to sort chocolates based on user selection
    public void sortChocolates(String sortBy) {
        for (int i = 0; i < chocolateCount - 1; i++) {
            for (int j = 0; j < chocolateCount - i - 1; j++) {
                if (sortBy.equals("weight") && chocolates[j].getWeight() > chocolates[j + 1].getWeight()) {
                    Chocolate temp = chocolates[j];
                    chocolates[j] = chocolates[j + 1];
                    chocolates[j + 1] = temp;
                } else if (sortBy.equals("name") && chocolates[j].getName().compareTo(chocolates[j + 1].getName()) > 0) {
                    Chocolate temp = chocolates[j];
                    chocolates[j] = chocolates[j + 1];
                    chocolates[j + 1] = temp;
                }
            }
        }
    }

    // Method to identify candies (sweets) within a specific weight range
    public void findSweetsInRange(double minWeight, double maxWeight) {
        System.out.println("Sweets within the weight range " + minWeight + " and " + maxWeight + ":");
        for (int i = 0; i < sweetCount; i++) {
            if (sweets[i].getWeight() >= minWeight && sweets[i].getWeight() <= maxWeight) {
                System.out.println(sweets[i].getName() + " - " + sweets[i].getWeight() + "g");
            }
        }
    }

    // Method to display all chocolates in the gift
    public void displayChocolates() {
        System.out.println("Chocolates in the gift:");
        for (int i = 0; i < chocolateCount; i++) {
            System.out.println(chocolates[i].getName() + " - " + chocolates[i].getWeight() + "g");
        }
    }
}

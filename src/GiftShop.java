
public class GiftShop {
    public static void main(String[] args) {
        // Creating a NewYearGift object
        NewYearGift gift = new NewYearGift(3, 3);

        // Adding chocolates
        gift.addChocolate(new Chocolate("Dairy Milk", 50));
        gift.addChocolate(new Chocolate("KitKat", 30));
        gift.addChocolate(new Chocolate("Snickers", 40));

        // Adding sweets
        gift.addSweet(new Sweet("Candy", 20));
        gift.addSweet(new Sweet("Barfi", 60));
        gift.addSweet(new Sweet("Ladoo", 70));

        // Calculate total weight
        System.out.println("Total weight of the gift: " + gift.calculateTotalWeight() + "g");

        // Sort chocolates by weight
        gift.sortChocolates("weight");
        System.out.println("\nChocolates sorted by weight:");
        gift.displayChocolates();

        // Find sweets in a given weight range
        System.out.println("\nSweets in the weight range 20g to 70g:");
        gift.findSweetsInRange(20, 70);
    }
}

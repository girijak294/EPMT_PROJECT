
public class FlowerShop {
    public static void main(String[] args) {
        
        Rose rose = new Rose();
        Jasmine jasmine = new Jasmine();
        Lilly lilly = new Lilly();

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower1(rose);
        bouquet.addFlower2(jasmine);
        bouquet.addFlower3(lilly);

        
        bouquet.showBouquetDetails();
    }
}

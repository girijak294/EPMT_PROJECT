
public class PizzaShop {
   
	public static void main(String[] args) {
        
        PizzaBase standardBase = new PizzaBase("Standard", 5.0);
        PizzaBase softBase = new PizzaBase("Soft", 6.0);

        Toppings tomato = new Toppings("Tomato", 1.0);
        Toppings corn = new Toppings("Corn", 1.5);
        Toppings mushrooms = new Toppings("Mushrooms", 2.0);
       
        Pizza pizza = new Pizza(standardBase);
  
        pizza.addTopping1(tomato);
        pizza.addTopping2(corn);
        pizza.addTopping3(mushrooms);

        
        pizza.showPizzaDetails();
    }
}
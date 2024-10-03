public class CandyMaker {

    private boolean empty;
    private boolean boiled;

    private static volatile CandyMaker instance;

    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    public static CandyMaker getInstance() {
        if (instance == null) {
            synchronized (CandyMaker.class) {
                if (instance == null) {
                    instance = new CandyMaker();
                }
            }
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with milk and chocolate mix.");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            
            empty = true;
            System.out.println("Draining the boiled mixture.");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            
            boiled = true;
            System.out.println("Boiling the mixture.");
        }
    }

    
    public boolean isEmpty() {
        return empty;
    }

    
    public boolean isBoiled() {
        return boiled;
    }

    
    public static void main(String[] args) {
        CandyMaker candyMaker = CandyMaker.getInstance();

        
        candyMaker.fill();
        candyMaker.boil();
        candyMaker.drain();
    }
}

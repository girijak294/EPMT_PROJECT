
public class GreatNumber {

    public static boolean isGreatNumber(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        int sum = a + b;
        int difference = Math.abs(a - b);
        
        if (sum == 6 || difference == 6) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        
        boolean result = isGreatNumber(a, b);
        System.out.println("Result: " + result);
    }
}

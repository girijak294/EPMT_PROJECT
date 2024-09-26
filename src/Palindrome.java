import java.util.function.Function;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";          
            Function<String, Boolean> isPalindrome = (str) -> 
            str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        
        boolean result = isPalindrome.apply(input);
        System.out.println(input + " is a palindrome: " + result);
    }
}

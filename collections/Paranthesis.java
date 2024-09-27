import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {

    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;                 }
            }
        }

        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while (sc.hasNextLine()) {
            String input = sc.nextLine();
            
            if (isBalanced(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        sc.close();
    }
}

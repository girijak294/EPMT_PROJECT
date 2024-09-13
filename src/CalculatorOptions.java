public class CalculatorOptions {

    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <number1> <operation> <number2>");
            System.out.println("Operations: + for addition, - for subtraction, * for multiplication, / for division");
            System.out.println("% for percentage calculation, %r for remainder (modulus)");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[2]);
            String operation = args[1];

            double result = 0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                case "%": 
                    result = (num1 / num2) * 100;
                    break;
                case "%r": 
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operation. Use +, -, *, /, %, or %r.");
                    return;
            }
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
        }
    }
}

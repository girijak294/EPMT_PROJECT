public class Calculator {

    public static void main(String[] args) {
        // Ensure correct number of arguments are provided (2 numbers and 1 operation)
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <number1> <operation> <number2>");
            System.out.println("Operations: + for addition, - for subtraction, * for multiplication, / for division");
            return;
        }

        try {
            // Parse the numbers from the command line arguments
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[2]);
            String operation = args[1];

            // Perform the calculation based on the operation
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
                default:
                    System.out.println("Invalid operation. Use +, -, *, or /.");
                    return;
            }

            // Print the result
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
        }
    }
}

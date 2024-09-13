public class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = new int[99];
        int missingNumber = 45;
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missingNumber) {
                numbers[index] = i;
                index++;
            }
        }
        int expectedSum = 100 * (100 + 1) / 2;
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        int missing = expectedSum - actualSum;
        System.out.println("The missing number is: " + missing);
    }
}

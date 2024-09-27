
public class CanBalance {

    public static boolean canBalance(int[] nums) {

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int num : nums) {
            leftSum += num;
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
    }
}


public class CanBalance {

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;

       
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];  
            int rightSum = totalSum - leftSum;  
            
            
            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;  // No balance point found
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};
        int[] arr3 = {10, 10};

        System.out.println("Can balance [1, 1, 1, 2, 1]: " + canBalance(arr1)); 
        System.out.println("Can balance [2, 1, 1, 2, 1]: " + canBalance(arr2)); 
        System.out.println("Can balance [10, 10]: " + canBalance(arr3));       
    }
}


public class MaxSpan {

    
    public static int maxSpan(int[] nums) {
        int maxSpan = 0;

        
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int leftIndex = i;  
            int rightIndex = i; 

            
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] == value) {
                    rightIndex = j;
                    break; 
                }
            }

            
            int span = rightIndex - leftIndex + 1;

            
            if (span > maxSpan) {
                maxSpan = span;
            }
        }

        return maxSpan;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 1, 1, 3};
        int[] arr2 = {1, 4, 2, 1, 4, 1, 4};
        int[] arr3 = {1, 4, 2, 1, 4, 4, 4};

        System.out.println("Max span in [1, 2, 1, 1, 3]: " + maxSpan(arr1)); 
        System.out.println("Max span in [1, 4, 2, 1, 4, 1, 4]: " + maxSpan(arr2)); 
        System.out.println("Max span in [1, 4, 2, 1, 4, 4, 4]: " + maxSpan(arr3)); 
    }
}

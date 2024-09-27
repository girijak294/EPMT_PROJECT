
public class LinearIn {
    
	public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;
        
        // Edge case: if inner is empty, return true
        if (inner.length == 0) {
            return true;
        }
        
        // Traverse both arrays
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                // Move both pointers when there's a match
                innerIndex++;
            }
            // Always move outer pointer forward
            outerIndex++;
        }
        
        // If we have gone through all elements in the inner array, return true
        return innerIndex == inner.length;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4})); // true
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // false
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4})); // true
    }
}

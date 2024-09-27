
public class Clump {
    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // We have a clump if the current element is the same as the previous one
                if (!inClump) {
                    clumpCount++;
                    inClump = true; // Mark that we're inside a clump
                }
            } else {
                // Exit the clump when the current element is different
                inClump = false;
            }
        }

        return clumpCount;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4})); // 2
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));    // 2
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));    // 1
    }
}

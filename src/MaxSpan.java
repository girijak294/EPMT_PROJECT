
public class MaxSpan {

	public static int maxSpan(int[] nums) {
		int maxSpan = 0;
		for (int i = 0; i < nums.length; i++) {
			int currentNum = nums[i];
			int firstIndex = i;
			int lastIndex = i;

			for (int j = nums.length - 1; j >= i; j--) {
				if (nums[j] == currentNum) {
					lastIndex = j;
					break;
				}
			}

			int span = lastIndex - firstIndex + 1;
			if (span > maxSpan) {
				maxSpan = span;
			}
		}

		return maxSpan;
	}

	public static void main(String[] args) {
		System.out.println(maxSpan(new int[] { 1, 2, 1, 1, 3 }));
		System.out.println(maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }));
		System.out.println(maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }));
	}
}

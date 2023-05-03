public class Solution {
    public int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public int arraySign(int[] nums) {
        int product = 1;
        int numNegatives = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                numNegatives++;
            }
            product *= nums[i];
        }

        if (numNegatives % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

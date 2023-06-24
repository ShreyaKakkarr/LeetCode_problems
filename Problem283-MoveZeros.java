class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;  // Pointer for non-zero elements

        // Move all non-zero elements to the left side of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }

        // Fill the remaining elements with zeros
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

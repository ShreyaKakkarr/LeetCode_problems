class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length - 1;
        int f = 0;
        while (l >= f) {
            int mid = (l + f) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                l = mid - 1;
            } else {
                f = mid + 1;
            }
        }
        return -1;
    }
}

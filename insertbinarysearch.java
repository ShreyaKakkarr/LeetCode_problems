class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length - 1;
        int f = 0;
        int flag=0;
        while (l >= f) {
            int mid = (l + f) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                l = mid - 1;

            } else {
                f = mid + 1;
                flag=1;
            }
        }
        if (flag==0)
        {
          return l+1;
        }
        else return f;
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;int i; int maxind=0;
        for(i=0; i<=nums.length-1;i++)
        {
          if(nums[i]> max)
          {
              max= nums[i];
              maxind= i;
          }
        }
        return maxind ;
    }
}

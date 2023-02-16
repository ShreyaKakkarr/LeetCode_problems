class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement=0;
        int majorityCount=0;
        int count;
        for( int i= 0; i<nums.length;i++)
        {   count=0;
            for(int j=0;j<nums.length;j++)
            {
                if( nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>=majorityCount)
            {
                majorityElement= nums[i];
                majorityCount = count;
            }
        }
        return majorityElement;
    }

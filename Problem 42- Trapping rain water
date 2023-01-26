class Solution {
    public int trap(int[] height) {
        int n= height.length;
      //calculating left max boundary
      int leftmax[]= new int[n];
      leftmax[0]=height[0];
      for(int i=1; i<n;i++)// loop to form left max array
      {
        leftmax[i]=Math.max(height[i], leftmax[i-1]);
      }
      //calculate right max boundary array
      int rightMax[]=new int[n];
      rightMax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--) // calculating min boundary for each element n adding to trapped water
       {
         rightMax[i]= Math.max(height[i], rightMax[i+1]);
       }
      int trappedWater=0;
      for(int i=0; i<n; i++)
      {
        int waterlevel=Math.min(leftmax[i], rightMax[i]);
        trappedWater += waterlevel-height[i];
      }
      return trappedWater;
    }
}

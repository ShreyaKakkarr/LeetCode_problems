// Median of two sorted arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {  int m=nums1.length;
       int n=nums2.length;
       int p= m+n;
       int q= p/2;
    
        int a[]= new int[p];
       for(int i=0;i<=p-1;i++)
       {
           if(i<m)
           {
               a[i]=nums1[i];
           }
           else
           {
               a[i]=nums2[i-m];
           }
       } 
       Arrays.sort(a);
       if(p==2)
       {
           return (a[0]+a[1])/2.0;
       }
       else if(p%2==0)
       {
          return (a[q-1]+a[q])/2.0;
       }
       else
       {
           return a[q];
       }


    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n1=nums1.length, n2=nums2.length;
        int i=0,j=0,k=0;
        int c[]=new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if (nums1[i]<nums2[j])
            {
                c[k]=nums1[i];
                i++;
            }
            else
            {
                c[k]=nums2[j];
                j++;
            }
            k++;
                
        }
        while(i<n1)
        {
            c[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            c[k]=nums2[j];
            j++;
            k++;
        }
      
        double median=0;
       
        if(k%2==0)
        {
            int a=k/2;
            median=(double)(c[a-1]+c[a])/2;
        }
     
        
            else
                median=c[k/2];
        
        return median;
        
    }
}
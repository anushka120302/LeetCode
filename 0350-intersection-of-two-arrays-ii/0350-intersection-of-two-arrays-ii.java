class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        
       
      //Set<Integer> set=new HashSet<>();[not using hashset as it does not allow duplicate values]
        ArrayList<Integer> set = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
                if(nums1[i]<nums2[j])
                    i++;
                else if(nums1[i]>nums2[j])
                    j++;
                else if(nums1[i]==nums2[j])
                {
                    set.add(nums1[i]);
                    i++;
                    j++;
                }
            
        }
        int ar[]=new int[set.size()];
        int k=0;
        for(Integer val:set)
            ar[k++]=val;
    
        
        return ar;
    
    }
}
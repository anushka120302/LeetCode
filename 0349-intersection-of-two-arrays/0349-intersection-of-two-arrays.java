/* class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr=new ArrayList<>();
        
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(i>0 && nums1[i]==nums1[i-1])
            {
                i++;
                continue;
            }
            if(nums1[i]==nums2[j])
            {
                arr.add(nums1[i]);
                i++;
                j++;
            }
           else if(nums1[i]<nums2[j])
                i++;
            else if(nums1[j]<nums2[i])
                j++;
           
                
        }
        int ar[]=new int[arr.size()];
        
        for( int l=0;l<ar.length;l++)
        {
            ar[l]=arr.get(l);
        }
            
        
        return ar;
    }
}
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(i > 0 && nums1[i] == nums1[i-1]){ //condition for remove the duplicate element 
                i++;
                continue;
            }
            if(nums1[i] == nums2[j]){ // if both the array has same element then put that element in the list 
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){ // as both the array is sorted, so adjust the index by comparing the element
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
        }
        
        int[] ans = new int[list.size()]; // store the list value in an array 
        for(int k = 0; k < ans.length; k++){
            ans[k] = list.get(k);
        }
        return ans;
    }
}
// class Solution {
//     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//           List<List<Integer>> ans=new ArrayList<>();
//          Arrays.sort(nums1);
//     Arrays.sort(nums2);
    
    
//     List<Integer> ls=new ArrayList<>();
    
//     for(int i=0;i<nums1.length;i++){
        
        
//         if(!search(nums2,nums1[i])){
            
//             if(!(ls.size()>0 && ls.get(ls.size()-1)==nums1[i])){
//                 ls.add(nums1[i]);
//             }
//         }
//     }
    
    
//     ans.add(ls);
//     ls=new ArrayList<>();
//     for(int i=0;i<nums2.length;i++){
        
        
//         if(!search(nums1,nums2[i])){
            
//             if(!(ls.size()>0 && ls.get(ls.size()-1)==nums2[i])){
//                 ls.add(nums2[i]);
//             }
//         }
//     }
//     ans.add(ls);
    
//     return ans;
    
    
    
// }

// public boolean search(int[] nums,int target){
    
    
//     int low=0;
//     int high=nums.length-1;
    
    
//     while(low<=high){
        
        
//         int mid=(low+high)/2;
        
        
//         if(nums[mid]==target) return true;
        
//         else if (nums[mid]<target){
            
//             low=mid+1;
//         }
//         else{

//             high=mid-1;
//         }
//     }
//     return false;
// }
    
// }


class Solution {
     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<List<Integer>> answer= new ArrayList<>();
         
         List<Integer> ans0= new ArrayList<>();
         List<Integer> ans1= new ArrayList<>();
         Set<Integer> set0 =new HashSet<>();
         Set<Integer> set1 =new HashSet<>();
         
         for(int i =0;i<nums1.length;i++)
         {
             set0.add(nums1[i]);
         }
         for(int i =0;i<nums2.length;i++)
         {
             set1.add(nums2[i]);
         }
         for(int n :set0)
         {
             if(set1.contains(n)==false)
             {
                 ans0.add(n);
             }
         }
         for(int n:set1)
         {
             if(set0.contains(n)==false)
             {
                 ans1.add(n);
             }
         }
         answer.add(ans0);
         answer.add(ans1);
         
         return answer;
     }
}
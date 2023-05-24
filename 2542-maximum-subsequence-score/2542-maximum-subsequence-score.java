// class Solution {
//     public long maxScore(int[] nums1, int[] nums2, int k) {
//         PriorityQueue<Integer> pq= new PriorityQueue<>();
//         for(int i =0;i<k;i++)
//         {
             
//         }
//     }
//     public int min(int arr[])
//     {
//         int min=arr[0];
//         for(int i =1;i<arr.length;i++)
//         {
//             if(min>arr[i])
//                 min= arr[i];
//         }
//         return min;
//     }
// }

class Solution {
public long maxScore(int[] nums1, int[] nums2, int k) {

    int n = nums1.length;
    
    // Creating the Pair of 1st Array with 2nd Array w.r.t their Indices
    int[][] pairs = new int[n][2];
    for(int i = 0; i < n; i++)
        pairs[i] = new int[]{nums1[i], nums2[i]};
    
    // Sorting the Pairs on the basis of 2nd Array in Descending Order
    Arrays.sort(pairs, (num1, num2) -> num2[1] - num1[1]);
    
    long sum = 0;
    long ans = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int[] pair : pairs) {
        
        sum += pair[0];
        pq.offer(pair[0]);
        
        // When PQ size is greater than the k then we don't need the current Pair's 1st Element
        // so we remove it from both the PQ and Sum
        if(pq.size() > k)
            sum -= pq.poll();
        
        // When PQ size reaches k then we do the Multiplication
        // Current Pair will have the Minimum Element from 2nd Array in selected k window
        if(pq.size() == k)
            ans = Math.max(ans, sum * pair[1]);
    }
    
    return ans;
}
}
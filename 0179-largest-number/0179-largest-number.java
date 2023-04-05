class Solution {
    
public String largestNumber(int[] nums) {
	//Convert to string array.
	List<String> snums = new ArrayList<>(nums.length);
	for (int i = 0; i < nums.length; i++) {
		snums.add(Integer.toString(nums[i]));
	} 
	//sort based on the criterion whichever generates a bigger number in descending order.
    Collections.sort(snums, (a, b)-> {
    	String s1 = a + b;
    	String s2 = b + a;
    	return s2.compareTo(s1);
    });
    //remove leading zeros.
    int k = 0;
    while (k < snums.size() - 1 && snums.get(k).equals("0")) 
    	k++;
    
    //output the result.
    StringBuffer ans = new StringBuffer();
    for (int i = k; i < snums.size(); i++) {
    	ans.append(snums.get(i)); 	
    }
    return ans.toString();
}
}
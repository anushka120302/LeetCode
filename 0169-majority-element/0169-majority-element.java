class Solution {
public int majorityElement(int[] nums) {
    int element = 0 ;
    int count = 0 ; 
    
    for(int i : nums){
    if(count == 0 ){
        element = i;
    }
    if(element == i){
        count += 1 ;
    }
    else{
        count -= 1 ;
    }
 }
    return element ;
}
}
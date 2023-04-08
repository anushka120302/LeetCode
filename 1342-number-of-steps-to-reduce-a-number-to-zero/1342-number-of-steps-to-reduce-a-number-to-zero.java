class Solution {
    public int numberOfSteps(int num) {
        
    return num == 0 ? 0 : num % 2 == 0 ? (numberOfSteps(num/2) + 1) : (numberOfSteps(num - 1) + 1);
    }
}
class Solution {
    
        public int countEven(int num) {
	// Digit sum of the last number, we can get each digit this way sicne the range is [1, 1000]
	int sum = num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10;

	// Check if the last number and its digit sum are even
	return (num - 1) / 2 + (sum % 2 == 0 && num % 2 == 0 ? 1 : 0);
}
    
}
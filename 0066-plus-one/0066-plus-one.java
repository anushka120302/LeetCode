class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        
        while (i >= 0 && digits[i] == 9)
            digits[i--] = 0;

        if(i == -1) {
            int[] arr = new int[digits.length + 1];
            System.arraycopy(digits, 0, arr, 1, digits.length);
            arr[0] = 1;
            return arr;
        } else digits[i]++;
        
        return digits;
    }
}
class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;

        String s = Integer.toString(n);

        char a[]=s.toCharArray();
        for(int i =0;i<a.length;i++)
        {
            if(i%2==0)
            sum+=Character.getNumericValue(a[i]);
            else
            sum-=Character.getNumericValue(a[i]);
        }

        return sum;
    }
}
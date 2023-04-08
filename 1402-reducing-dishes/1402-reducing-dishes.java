class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int a =0,b=0;

        for(int i =satisfaction.length-1;i>=0 && a+satisfaction[i]>0;i--)
        {
            a+=satisfaction[i];
            b+=a;
        }
        return b;
    }
}
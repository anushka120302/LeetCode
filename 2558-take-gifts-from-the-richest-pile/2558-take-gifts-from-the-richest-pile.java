class Solution {
    public long pickGifts(int[] gifts, int k) {
        long max=0,count=0;
        for(int i =1;i<=k;i++)
        {
            Arrays.sort(gifts);
            gifts[gifts.length-1]=(int)Math.sqrt(gifts[gifts.length-1]);
        }
        for(int i =0;i<gifts.length;i++)
            {
                count = count +gifts[i];
            }
        return count;
    }
}
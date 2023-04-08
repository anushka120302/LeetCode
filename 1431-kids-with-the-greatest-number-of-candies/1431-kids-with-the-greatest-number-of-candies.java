class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List li=new ArrayList();
        int max=Integer.MIN_VALUE;;
        for(int i=0;i<n;i++)
        {
            if(candies[i]>=max)
                max=candies[i];
        }
        for(int i=0;i<n;i++)
        {
            if((candies[i]+extraCandies)>=max)
                li.add(true);
            else
                li.add(false);
        }
        return li;
    }
}
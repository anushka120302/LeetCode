class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int max=0,wealth=0;
        for(int i=0;i<accounts.length;i++)
        {
            wealth=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                wealth+=accounts[i][j];
            }
             if(wealth>max)
                 max=wealth;
                 
        }
        return max;
    }
}
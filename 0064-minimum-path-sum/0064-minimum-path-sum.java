class Solution {
    public int minPathSum(int[][] grid) {
        int h=grid.length;
        int w=grid[0].length;

        for(int i =0;i<h;i++)
        {
            for(int j =0;j<w;j++)
            {
                if(i==0 && j==0)
                grid[i][j]=grid[i][j];
                else if(i==0 && j!=0)
                grid[i][j]+=grid[i][j-1];
                else if(i!=0 && j==0)
                grid[i][j]+=grid[i-1][j];
                else
                grid[i][j]+=Math.min(grid[i-1][j], grid[i][j-1]);

            }
        }
        return grid[h-1][w-1];
    }
}
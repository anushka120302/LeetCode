class Solution {
    public int[][] generateMatrix(int n) {
     
        
        int ans[][]= new int[n][n];
        int count =1;
        int total=n*n;
        
        int startRow=0, startCol=0,endRow=n-1,endCol=n-1;
        
        while(count<=total)
        {
           //top
            for(int i =startCol;i<=endCol;i++)
            {
                ans[startRow][i]=count;
                count++;
            }
            startRow++;
            
            //rightmost
             for(int i=startRow;i<=endRow;i++)
            {
                ans[i][endCol]=count;
                count++;
            }
            endCol--;
            
            //bottom
            for(int i=endCol;i>=startCol;i--)
            {
                ans[endRow][i]=count;
                count++;
            }
            endRow--;
            
            //leftmost
            for(int i=endRow;i>=startRow;i--)
            {
                ans[i][startCol]=count;
                count++;
            }
            startCol++;
            
        }
        return ans;
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int count =0;
        for(int i =0;i<mat.length;i++)
        {
            count =count+mat[i][i]+mat[i][mat.length-1-i];
        }
        if(mat.length%2==1)
        {
            count =count -mat[mat.length/2][mat.length/2];
        }
        return count;
    }
}
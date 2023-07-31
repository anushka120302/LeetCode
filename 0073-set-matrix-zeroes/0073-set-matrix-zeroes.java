class Solution {
    public void setZeroes(int[][] a) {
        int ar[][]= new int[a.length][a[0].length];
         for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                ar[i][j]=a[i][j];
            }
         }
        for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==0)
                {
                    for(int k=0;k<a[0].length;k++)
                    {
                        ar[i][k]=0;
                    }
                    for(int k=0;k<a.length;k++)
                    {
                        ar[k][j]=0;
                    }
                }
            }
        }
         for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=ar[i][j];
            }
         }
    }
}
class Solution {
    public boolean checkIfExist(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            double n=arr[i];
            
            for(int j=0;j<arr.length;j++)
            {
                if((arr[j]==n/2)&&(i!=j))
                    return true;
            }
        }
        return false;
    }
}
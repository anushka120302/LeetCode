class Solution 
{
    public int totalMoney(int n) 
    {
        int a[]=new int[n];
        int monday=1;
        a[0]=monday;
        
        for(int i=1;i<n;i++)
        {
            if(i%7==0)
            {
                monday++;
                a[i]=monday;
            }
            else
                a[i]=a[i-1]+1;
        }
            int sum=0;
        
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
        
    }
}
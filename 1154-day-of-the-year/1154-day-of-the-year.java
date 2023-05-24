class Solution {
    public int dayOfYear(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        
        
        int days=Integer.parseInt(date.substring(8));
        int mon=Integer.parseInt(date.substring(5,7));
        
        int count =days+daymon(mon);
        
        if((leapcheck(year)==1) && mon>2)
            count =count+1;
        return count;
        
    }
    public int leapcheck(int year)
    {
        int flag =0;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    flag=1;
                }
                else flag =0;
            }
            else
                flag =1;
        }
        return flag;
    }
    public int daymon(int mon)
    {
        int x=0;
        int arr[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
        while(mon>=1)
        {
            x=x+arr[mon-1];
            mon--;
        }
        return x;
    }
}
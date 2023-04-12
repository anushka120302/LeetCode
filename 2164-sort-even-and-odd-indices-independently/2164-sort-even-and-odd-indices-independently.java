class Solution {
    public int[] sortEvenOdd(int[] a) {
        a=sortodd(a);
        a=sorteven(a);
        
        return a;
    }
    public int[] sortodd(int a[])
    {
        for(int i=1;i<a.length-1;i+=2)
        {
            for(int j=1;j<a.length-1-i;j+=2)
            {
                if(a[j]<a[j+2])
                {
                    int temp=a[j];
                    a[j]=a[j+2];
                    a[j+2]=temp;
                }
            }
        }
        return a;
    }
    public int[] sorteven(int a[])
    {
        for(int i=0;i<a.length-2;i+=2)
        {
            for(int j=0;j<a.length-2-i;j+=2)
            {
                if(a[j]>a[j+2])
                {
                    int temp=a[j];
                    a[j]=a[j+2];
                    a[j+2]=temp;
                }
            }
        }
        return a;
    }
}
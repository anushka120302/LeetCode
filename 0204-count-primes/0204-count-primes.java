/*class Solution {
    public int countPrimes(int n) {

        int c=0;
        for(int i=2;i<n;i++)
        {
           if(isprime(i))
               c++;
        }
        return c;
    }
    public boolean isprime(int n)
    { 
        int c=0;
        for(int i=2;i*i<=n;i++)
        
            if(n%i==0)
               
            return false;
        
            return true;
    }
}*/
public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}
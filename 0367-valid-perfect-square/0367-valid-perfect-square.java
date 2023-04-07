class Solution {
    public boolean isPerfectSquare(int num) {
        
      /*for(int i=0;i<=num;i++)
      {
          if(i*i==num)
              return true;
      }
        return false;
        */
        
     
        int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0;
    }
}
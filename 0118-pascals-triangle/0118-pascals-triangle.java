class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascaltri1=new ArrayList<List<Integer>>();
        
       
            if(numRows<=0)
                return pascaltri1;
         for(int i=0;i<numRows;i++)
         {   
             List<Integer> rows = new ArrayList<Integer>();
             
             for(int j=0;j<=i;j++)
             {
                 if(j==0 || j==i)
                     rows.add(1);
                 else
                     rows.add(pascaltri1.get(i-1).get(j-1) + pascaltri1.get(i-1).get(j));
             }
           pascaltri1.add(rows);
             
            
             

         }
        return pascaltri1;
    }
}
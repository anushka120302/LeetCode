class Solution {
    public int longestCycle(int[] edges) {
        int ans=-1;

        int cycleTracking[][]= new int[edges.length][2];  //to track the length of the node vidited and i is the reference node

       Arrays.fill(cycleTracking,new int[]{-1,-1});

       for(int i =0;i<edges.length;i++)
       {
           int dist=0;

           int j=i;

           while(j!=-1)
           {
               int distFromSourceId=cycleTracking[j][0];
               int cycleIdentifier= cycleTracking[j][1];

               if(distFromSourceId==-1)
               cycleTracking[j]=new int[]{dist++,i};

               else
               {
                   if(cycleIdentifier == i)
                   ans=Math.max(ans, dist- distFromSourceId);
                   break;

               }

               j=edges[j];


           }
       }
       return ans;
    }
}
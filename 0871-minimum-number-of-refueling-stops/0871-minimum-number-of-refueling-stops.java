class Solution 
{
    public int minRefuelStops(int target, int startFuel, int[][] stations) 
    {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        long dist =startFuel;
        int index=0;
        int count =0;
        
        
        while(dist<target)
        {
            while(index<stations.length && stations[index][0]<=dist)
            {
                pq.add(stations[index][1]);
                index++;
            }
            if(dist>=target)
                return count;
            if(pq.isEmpty())
                return -1;
            dist+=pq.poll();
            count ++;
        }
        return count;
    }
}
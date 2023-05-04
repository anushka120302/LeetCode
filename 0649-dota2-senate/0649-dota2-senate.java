class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();
        
        for(int i =0;i<senate.length();i++)
        {
            if(senate.charAt(i)=='R')
                rad.offer(i);
            else
                dir.offer(i);
        }
        
        while(!rad.isEmpty() && !dir.isEmpty())
        {
             int r_id = rad.poll();
            int d_id = dir.poll();
            if (r_id < d_id) {
                rad.offer(r_id + n);
            } else {
                dir.offer(d_id + n);
            }
        }

        return (rad.size() > dir.size()) ? "Radiant" : "Dire";
        // int r=0,d=0;
        // for(int i =0;i<senate.length();i++)
        // {
        //     if(senate.charAt(i)=='R')
        //         r++;
        //     else
        //         d++;
        // }
        // if(r>d)
        //     return("Radiant");
        // else if(d>r)
        //    return("Dire");
        // else
        // {
        //     if(senate.charAt(0)=='R')
        //         return "Radiant";
        //     else
        //         return ("Dire");
        
    }
}
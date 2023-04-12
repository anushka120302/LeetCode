class Solution {
    public long countPairs(int n, int[][] edges) {
        
        List<List<Integer>> adj= new ArrayList<>();

        for(int i =0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int [] edge: edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        long totalpairs=0;
        int remainingNodes=n;

        boolean visited[]=new boolean[n];
        for(int i =0;i<n;i++)
        {
            if(visited[i]==false){
            int currentComponents= dfs(i,adj,visited,new int[1]);
            remainingNodes=n-currentComponents;
            totalpairs+= (long)currentComponents*remainingNodes;
            }
        }
        return totalpairs/2;
    }

    public int dfs(int current, List<List<Integer>> adj, boolean visited[], int count[])
    {
        if(visited[current]==true)
        return count[0];

        visited[current]=true;
        count[0]++;

        for(int adjNode: adj.get(current))
        dfs(adjNode,adj,visited,count);


        return count[0];
    }

}
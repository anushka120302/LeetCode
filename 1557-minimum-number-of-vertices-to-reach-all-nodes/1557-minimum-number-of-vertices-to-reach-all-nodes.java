class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges)     {
        int indegreecount[] = new int[n];
        for(List<Integer> list:edges)
        {
            indegreecount[list.get(1)]++;
        }
        List<Integer> ans= new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            if(indegreecount[i]==0)
                ans.add(i);
        }
        return ans;
    }
}
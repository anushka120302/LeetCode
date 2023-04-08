class Solution {
    public int minReorder(int n, int[][] connections) {

        List<List<Integer>> arr=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<Integer>());
        }

        for(int a[]:connections)
        {
            arr.get(a[0]).add(a[1]);
            arr.get(a[1]).add(-a[0]);
        }
        return dfs(arr,new boolean[n],0);
    }
    int dfs(List<List<Integer>> arr, boolean visited[], int root)
    {
        int cnt=0;
        visited[root]=true;

        for(int to:arr.get(root))
        {
            if(!visited[Math.abs(to)])
            {
                cnt+=dfs(arr,visited,Math.abs(to)) + ((to>0)?1:0);
            }
        }
        return cnt;
    }
}
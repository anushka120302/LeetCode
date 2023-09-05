class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        getcombos(0,candidates, target, ans,new ArrayList());

        return ans;
    }
    public void getcombos(int start, int[] candidates, int target, List<List<Integer>> ans, List<Integer> current)
    {
        if(target==0)
        ans.add(new ArrayList(current));
        if(target<0)
        return;
        
        for(int i =start; i<candidates.length;i++)
        {
            current.add(candidates[i]);
            getcombos(i,candidates,target-candidates[i],ans,current);
            current.remove(current.size()-1);
        }
    }
}
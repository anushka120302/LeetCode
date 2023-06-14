class Solution {
    int min=Integer.MAX_VALUE;
    ArrayList<Integer> list = new ArrayList<>(); 
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        for(int i=0;i<list.size()-1;i++){
            min=Math.min(min,list.get(i+1)-list.get(i));
        }
        return min;
    }
    public void solve(TreeNode root){
        if(root==null) return;
        
        solve(root.left);
        list.add(root.val);
        solve(root.right);
    }
}
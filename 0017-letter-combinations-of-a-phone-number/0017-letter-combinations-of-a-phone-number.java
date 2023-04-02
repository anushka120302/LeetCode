class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> hm = new HashMap<>();
        List<String> ans =new ArrayList<>();

        if(digits.length()==0)
        return ans;


        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
       
       
        backtracking(digits,0,hm,new StringBuilder(),ans);
        return ans;
    }

    public void backtracking(String digits, int i ,HashMap<Character, String> hm, StringBuilder sb, List<String> ans)
    {
        if(i==digits.length())
        {
            ans.add(sb.toString());
            return;
        }
        String a=hm.get(digits.charAt(i));
        for(int k=0;k<a.length();k++)
        {
            sb.append(a.charAt(k));
            backtracking(digits,i+1,hm,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
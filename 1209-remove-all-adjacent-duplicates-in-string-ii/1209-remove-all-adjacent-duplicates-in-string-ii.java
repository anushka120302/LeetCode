class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character,Integer>> stack= new Stack<>();
        
        for(char c:s.toCharArray())
        {
            if(stack.empty() || stack.peek().getKey()!=c)
            {
                stack.push(new Pair<>(c,1));
            }
            else
            {
                Pair<Character,Integer> pair= stack.pop();
                stack.push(new Pair<>(pair.getKey(), pair.getValue()+1));
                if(stack.peek().getValue()==k)
                    stack.pop();    
            }
        }
        String ans ="";
        while(!stack.isEmpty())
        {
            Pair<Character,Integer> pr= stack.pop();
            int freq= pr.getValue();
            while(freq-->0)
            {
                ans=ans+pr.getKey();
            }
        }
        String ch="";
        for(int i =ans.length()-1;i>=0;i--)
        {
            ch=ch+ans.charAt(i);
        }
        return ch;
    }
}
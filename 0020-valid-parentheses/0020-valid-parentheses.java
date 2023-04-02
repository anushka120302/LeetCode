class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c = s.charAt(0);
        if(c == ']' || c == '}' || c == ')') return false;
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else {
                if(!stack.isEmpty() && (ch == ')' && stack.peek() == '(')) stack.pop();
                else if(!stack.isEmpty() && (ch == '}' && stack.peek() == '{')) stack.pop();
                else if(!stack.isEmpty() && (ch == ']' && stack.peek() == '[')) stack.pop();
                else return false;
                
            }
        }
        
        return (stack.isEmpty());
        
    }
}
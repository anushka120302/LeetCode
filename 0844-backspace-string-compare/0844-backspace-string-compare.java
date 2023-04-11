class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
                sb1.append(s.charAt(i));
             else if(sb1.length()>=1)
                sb1.deleteCharAt(sb1.length()-1);
           
        }
        
        for(int i =0;i<t.length();i++)
        {
            
            if(t.charAt(i)!='#')
                sb2.append(t.charAt(i));
            else if(sb2.length()>=1)
                sb2.deleteCharAt(sb2.length()-1);
        }
        if(sb1.toString().equals(sb2.toString()))
            return true;
        else
            return false;
    }
}
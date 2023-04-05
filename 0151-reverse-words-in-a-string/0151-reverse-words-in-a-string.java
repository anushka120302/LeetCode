class Solution {
    public String reverseWords(String s) 
    {
        
        String str[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
            if(!(str[i].equals("")))
                sb.append(str[i]+" ");
        }
        return sb.toString().trim();
    }
    
}
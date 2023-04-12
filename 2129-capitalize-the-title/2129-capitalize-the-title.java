class Solution {
    public String capitalizeTitle(String title) {
           
        String[] str = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            if(s.length() == 1 || s.length() == 2) sb.append(s.toLowerCase());
            else {
                String word = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                sb.append(word);
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    
    }
}
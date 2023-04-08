/*class Solution {
    public String defangIPaddr(String address) {
        String s=address.replaceAll("\\.","[.]");
        return s;
    }
}*/
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        int end = address.length();
        for (int i = 0; i < end; i++){
            char curr = address.charAt(i);
            if (curr == '.'){
                str.append("[.]");
            } else {
                str.append(curr);
            }
        }
        return str.toString();
    }
}
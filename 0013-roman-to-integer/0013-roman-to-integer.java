class Solution {
    public int romanToInt(String s) {
            Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        int sum=0,slen=s.length(),curr=0,after=0;
        sum+=map.get(s.charAt(slen-1));
        for(int i=slen-2;i>-1;i--){
            curr=map.get(s.charAt(i));
            after=map.get(s.charAt(i+1));
            if(curr<after){
                sum-=curr;
            }
            else
                sum+=curr;
        }
        return sum;
    }
}
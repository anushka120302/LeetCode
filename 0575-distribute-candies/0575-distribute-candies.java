class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i =0;i<candyType.length;i++)
        {
            map.put(candyType[i],i);
        }
        

        return Math.min(map.size(), candyType.length/2);
    }
}
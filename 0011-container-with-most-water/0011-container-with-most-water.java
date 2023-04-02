class Solution 
{
    public int maxArea(int[] height) 
    {
        int l=0,r=height.length-1;
        int maxArea=0;
        
        while(l<r)
        {
            if(height[l]<height[r])
            {
                int area=height[l]*(r-l);
                maxArea=Math.max(maxArea,area);
                l++;
            }
            else
            {
                int area=height[r]*(r-l);
                maxArea=Math.max(maxArea,area);
                r--;
            }
        }
        return maxArea;
    }
}
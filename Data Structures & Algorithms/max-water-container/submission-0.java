class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int l = 0;
        int r = len - 1;
        int maxArea = Integer.MIN_VALUE;
        while(l < r){
            int area = Math.min(heights[l], heights[r]) * (r-l);
            maxArea = Math.max(maxArea, area);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}

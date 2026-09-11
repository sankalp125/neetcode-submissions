class Solution {
    public int trap(int[] height) {
        int len  = height.length;
        int water = 0;
        int left = 0;
        int right = len -1;
        int leftMax = height[0];
        int rightMax = height[len -1];
        while(left < right){
            if(height[left] <= height[right]){
                leftMax = Math.max(leftMax, height[left]);
                water = water + leftMax - height[left];
                left++;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                water = water + rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}

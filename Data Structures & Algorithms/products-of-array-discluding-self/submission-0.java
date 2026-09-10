class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int[] ans = new int[len];
        for(int i = 0; i<len; i++){
            ans[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }
        for(int i = len-1; i>=0; i--){
            ans[i] = ans[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return ans;
    }
}  

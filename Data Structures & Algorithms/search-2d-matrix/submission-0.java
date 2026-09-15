class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] nums: matrix){
            int len = nums.length;
            if(target<=nums[len-1]){
                int left = 0;
                int right = len -1;
                while(left<=right){
                    int mid = left + (right - left)/2;
                    if(target == nums[mid]){
                        return true;
                    }else if(target > nums[mid]){
                        left = mid + 1;
                    }else{
                        right = mid -1;
                    }
                }
                break;
            }else{
                continue;
            }
        }
        return false;
    }
}

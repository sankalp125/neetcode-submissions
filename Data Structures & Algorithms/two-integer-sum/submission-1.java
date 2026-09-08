class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<len; i++){
            if(hm.containsKey(nums[i])){
                ans[0] = hm.get(nums[i]);
                ans[1] = i;
                return ans;
            }else{
                int remaining = target - nums[i];
                hm.put(remaining, i);
            }
        }
        return ans;
    }
}

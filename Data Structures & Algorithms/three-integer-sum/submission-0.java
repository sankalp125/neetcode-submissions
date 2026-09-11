class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<len; i++){
            int l = i + 1;
            int r = len -1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    set.add(new ArrayList<Integer>(List.of(nums[i], nums[l], nums[r])));
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }

}

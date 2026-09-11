class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<len; i++){
            int l = i + 1;
            int r = len -1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    set.add(new ArrayList<Integer>(List.of(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
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

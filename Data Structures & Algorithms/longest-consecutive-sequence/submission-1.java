class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxLength = 0;
        for(int i : set){
            int length = 0;
            if(set.contains(i-1)){
                continue;
            }else{
                int j = i;
                while(set.contains(j++)){
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}

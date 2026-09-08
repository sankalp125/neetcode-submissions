class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int len = nums.length;

        // 1. Frequency count
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 2. Bucket: index = frequency
        List<Integer>[] freq = (List<Integer>[]) new List[len + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int frequency = entry.getValue();

            if (freq[frequency] == null) {
                freq[frequency] = new ArrayList<>();
            }

            freq[frequency].add(key);
        }

        // 3. Traverse from highest frequency
        int[] ans = new int[k];
        int x = 0;

        for (int i = len; i >= 1 && x < k; i--) {

            if (freq[i] != null) {

                for (int num : freq[i]) {

                    ans[x++] = num;

                    if (x == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
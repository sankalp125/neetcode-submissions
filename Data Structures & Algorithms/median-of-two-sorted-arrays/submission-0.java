class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Binary search hamesha smaller array par
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        // Total left partition mein kitne elements hone chahiye
        int leftSize = (m + n + 1) / 2;

        while (left <= right) {

            // nums1 ka partition
            int partition1 = left + (right - left) / 2;

            // nums2 ka partition automatically decide hoga
            int partition2 = leftSize - partition1;

            // nums1 boundaries
            int L1 = (partition1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[partition1 - 1];

            int R1 = (partition1 == m)
                    ? Integer.MAX_VALUE
                    : nums1[partition1];

            // nums2 boundaries
            int L2 = (partition2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[partition2 - 1];

            int R2 = (partition2 == n)
                    ? Integer.MAX_VALUE
                    : nums2[partition2];

            // Partition valid hai
            if (L1 <= R2 && L2 <= R1) {

                // Total elements odd
                if ((m + n) % 2 == 1) {
                    return Math.max(L1, L2);
                }

                // Total elements even
                return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
            }

            // nums1 se bahut zyada elements left mein le liye
            if (L1 > R2) {
                right = partition1 - 1;
            }

            // nums1 se bahut kam elements left mein liye
            else {
                left = partition1 + 1;
            }
        }

        return 0.0;
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        int left = 1; 
        int right = 0;
        int minHours = Integer.MAX_VALUE;
        for(int i: piles){
            right = Math.max(right, i);
        }
        while(left<=right){
            int mid = left + (right - left)/2;
            if(canFinish(piles, h, mid)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;

    }
    public boolean canFinish(int[] piles, int h, int k){
        int hours = 0;
        for(int i : piles){
            hours += (i + k -1)/k;
        }
        return hours<=h;
    }
}

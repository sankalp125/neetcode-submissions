class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {

            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {

                int current = stack.pop();

                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;
                int area = heights[current] * width;

                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        // Remaining bars
        while (!stack.isEmpty()) {

            int current = stack.pop();

            int right = len;
            int left = stack.isEmpty() ? -1 : stack.peek();

            int width = right - left - 1;
            int area = heights[current] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
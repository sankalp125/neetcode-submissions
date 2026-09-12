class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[len];
        for(int i = 0; i<len; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }else {
                if(temperatures[stack.peek()] < temperatures[i]){
                    while(!stack.isEmpty() && temperatures[stack.peek()]        <temperatures[i]){
                        int index = stack.pop();
                        int days = i - index;
                        result[index] = days;
                    }
                    stack.push(i);
                }else{
                    stack.push(i);
                }
            }
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                int index = stack.pop();
                result[index] = 0;
            }
        }
        return result;
    }
}

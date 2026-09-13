class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Integer[] indices = new Integer[len];
        for(int i = 0; i<len; i++){
            indices[i] = i;
        }
        Arrays.sort(indices,(a,b) -> Integer.compare(position[b], position[a]));
        Stack<Double> stack = new Stack<>();
        for(int i: indices){
            double time = (double) (target - position[i])/speed[i];
            if(stack.isEmpty()){
                stack.push(time);
            }else{
                if(time > stack.peek()){
                    stack.push(time);
                }
            }
        }
        return stack.size();
    }
}

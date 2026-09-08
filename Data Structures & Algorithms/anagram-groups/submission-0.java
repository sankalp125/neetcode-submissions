class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i<len; i++){
                hm.computeIfAbsent(sortedString(strs[i]), k-> new ArrayList<>()).add(strs[i]);
        }
        hm.forEach((key, value) -> 
            ans.add(value)
        );
        return ans;
    }
    public String sortedString(String s){
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}

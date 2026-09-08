class Solution {
    public boolean isAnagram(String s, String t) {
        char[] tempS = s.toCharArray();
        Arrays.sort(tempS);
        String sortedS = new String(tempS);
        char[] tempT = t.toCharArray();
        Arrays.sort(tempT);
        String sortedT = new String(tempT);
        if(sortedS.equals(sortedT)){
            return true;
        }else{
            return false;
        }
    }
}

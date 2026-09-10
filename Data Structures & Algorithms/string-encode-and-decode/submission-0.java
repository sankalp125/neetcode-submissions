class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String i : strs){
            int len = i.length();
            str = str + len + "#" + i;
        }
        return str;
    }

    public List<String> decode(String str) {

    ArrayList<String> li = new ArrayList<>();

    int len = str.length();
    int i = 0;

    while (i < len) {

        // 1. Read the length
        int count = 0;

        while (str.charAt(i) != '#') {
            count = count * 10 + (str.charAt(i) - '0');
            i++;
        }

        // 2. Skip '#'
        i++;

        // 3. Read exactly 'count' characters
        String temp = "";

        while (count > 0) {
            temp = temp + str.charAt(i);
            count--;
            i++;
        }

        // 4. Add decoded string
        li.add(temp);
    }

    return li;
}
}

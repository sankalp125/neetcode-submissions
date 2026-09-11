class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        for(int i = 0; i<9; i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        int len = board.length;
        for(int r = 0; r<len; r++){
            for(int c = 0; c<board[r].length; c++){
                char cell = board[r][c];
                if(cell == '.'){
                    continue;
                }
                if(rows[r].contains(cell)){
                    return false;
                }
                rows[r].add(cell);
                if(cols[c].contains(cell)){
                    return false;
                }
                cols[c].add(cell);
                int box = (r/3) * 3 + (c/3);
                if(boxes[box].contains(cell)){
                    return false;
                }
                boxes[box].add(cell);
            }
        }
        return true;
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9 * 9; i++) {
            int vertical = i / 9;
            int horizontal = i % 9;

            if(board[vertical][horizontal] == '.')
                continue;
                
            if (!crossCheck(i, board[vertical][horizontal], board)) {
                return false;
            }
        }

        return true;
    }

    public boolean crossCheck(int index, char nums, char[][] board) {
        int vertical = index / 9;
        int horizontal = index % 9;

        // Horizontal Check
        for (int i = 0; i < 9; i++) {
            if (i != horizontal && board[vertical][i] == nums) {
                return false;
            }
        }

        // Vertical Check
        for (int i = 0; i < 9; i++) {
            if (i != vertical && board[i][horizontal] == nums) {
                return false;
            }
        }

        // Box Check
        int boxHorizontal = vertical - vertical % 3;
        int boxVertical = horizontal - horizontal % 3;
        for (int i = boxHorizontal; i < boxHorizontal + 3; i++) {
            for (int j = boxVertical; j < boxVertical + 3; j++) {
                if (board[i][j] == nums && (i != vertical || j != horizontal)) {
                    return false;
                }
            }
        }

        return true;
    }
}
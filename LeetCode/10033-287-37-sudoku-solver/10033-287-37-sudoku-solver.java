class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board);
    }

    public boolean sudoku(char[][] board) {
        for (int i = 0; i < 81; i++) {
            int vertical = i / 9;
            int horizontal = i % 9;

            if (board[vertical][horizontal] == '.') {
                for (char c = '1'; c <= '9'; c++) {
                    if (crossCheck(i, c, board)) {
                        board[vertical][horizontal] = c;
                        if (sudoku(board)) {
                            return true;
                        } else {
                            board[vertical][horizontal] = '.';
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    // If rules 1 and 2 are satisfied, Sudoku rules are valid.
    // but, output result incorrect, box checking is required.
    public boolean crossCheck(int index, char nums, char[][] board) {
        int vertical = index / 9;
        int horizontal = index % 9;

        // Horizontal Check
        for (int i = 0; i < 9; i++) {
            if (board[vertical][i] == nums && 
            i != horizontal) {
                return false;
            }
        }

        // Vertical Check
        for (int i = 0; i < 9; i++) {
            if (board[i][horizontal] == nums && 
            i != vertical) {
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
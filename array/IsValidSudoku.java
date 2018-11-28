// 2018.11.27
// https://leetcode-cn.com/problems/valid-sudoku/description/
// 验证九宫格中的数字那儿, hashtable 又起作用了
public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, // { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(new Solution().isValidSudoku(board));
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int oct[][] = { { 1, 2 }, { -1, 1 }, { -2, -1 } };
        String p;
        for (int i = 0; i != 9; ++i) {
            for (int j = 0; j != 9; ++j) {
                p = String.valueOf(board[i][j]);
                if (p.equals(".") == false) {
                    // System.out.println(p);
                    // Verify Row.
                    for (int k = 0; k != 9; ++k) {
                        if (k != j && p.equals(String.valueOf(board[i][k])) == true) {
                            // System.out.println(board[i][k]);
                            return false;
                        }
                    }

                    // Verify column
                    for (int k = 0; k != 9; ++k)
                        if (k != i && p.equals(String.valueOf(board[k][j])) == true) {
                            // System.out.println(board[k][j]);
                            return false;
                        }

                    // Verify numbers in a Octothorp (#)
                    for (int m = 0; m != 2; ++m) {
                        for (int n = 0; n != 2; ++n) {
                            if (p.equals(String.valueOf(board[i + oct[i % 3][m]][j + oct[j % 3][n]])) == true) {
                                // System.out.println(board[i + oct[i % 3][m]][j + oct[j % 3][n]]);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}

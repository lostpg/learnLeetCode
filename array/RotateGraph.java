// 2018.11.27
// https://leetcode-cn.com/problems/rotate-image/
// TODO(11.27): retate() 中, 两层循环的起止下标还有些问题.
public class RotateGraph {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        // int[][] matrix1 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15,
        // 14, 12, 16 } };
        // int[][] matrix = { { 1 } };
        int[][] matrix1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        new Solution().rotate(matrix);
        System.out.println();
        for (int[] a : matrix) {
            for (int e : a)
                System.out.printf("%3d ", e);
            System.out.println();
        }
        new Solution().rotate(matrix1);
        System.out.println();
        for (int[] a : matrix1) {
            for (int e : a)
                System.out.printf("%3d ", e);
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length - 1;
        int half =3;
        int tmp;
        for (int row = 0; row <= half; ++row) {
            for (int col = 0; col < half-row; ++col) {
                System.out.printf("%d%d, ", row, col);
                tmp = matrix[col][len - row]; // I 暂存
                matrix[col][len - row] = matrix[row][col]; // II->I
                matrix[row][col] = matrix[len - col][row]; // III->II
                matrix[len - col][row] = matrix[len - row][len - col]; // IV->III
                matrix[len - row][len - col] = tmp; // I->IV

                // for (int[] a : matrix) {
                // for (int e : a)
                // System.out.printf("%3d ", e);
                // System.out.println();
                // }
            }
        }
    }
}

package jzoffer4;

public class Solution2 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows*cols == 0) return false;

        int row = rows-1;
        int col = 0;
        while (row >= 0 && col < cols) {
            if (matrix[row][col] < target)  col++;
            else if (matrix[row][col] > target) row--;
            else return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,4,7,11,15}, {2,5,8,12,19},
                {3,6,9,16,22}, {10,13,14,17,24},
                {8,21,23,26,30}};
        System.out.println(findNumberIn2DArray(matrix,5));
    }
}

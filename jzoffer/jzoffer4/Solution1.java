package jzoffer4;

public class Solution1 {
        public static boolean findNumberIn2DArray(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++)
                    if (matrix[i][j] == target)
                        return true;

            return false;
        }

    public static void main(String[] args) {
        int[][] matrix = { {1,4,7,11,15}, {2,5,8,12,19},
                           {3,6,9,16,22}, {10,13,14,17,24},
                           {8,21,23,26,30}};
        System.out.println(findNumberIn2DArray(matrix,5));
    }
}

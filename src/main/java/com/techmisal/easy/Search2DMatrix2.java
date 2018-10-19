package com.techmisal.easy;

public class Search2DMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int maxColumn = matrix[0].length - 1;
        for (int[] row : matrix) {
            if (row[0] <= target && row[maxColumn] >= target) {
                for (int i = 0; i <= maxColumn; i++) {
                    int x = row[i];
                    if (x == target) {
                        return true;
                    } else if (x >= target) {
                        maxColumn = i;
                        break;
                    }
                }
            }
        }
        return false;
    }
}

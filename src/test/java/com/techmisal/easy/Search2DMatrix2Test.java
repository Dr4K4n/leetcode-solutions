package com.techmisal.easy;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Search2DMatrix2Test {

    @Test
    public void testSearchMatrixEmpty() {
        int[][] matrix = new int[][]{};
        int target = 5;
        boolean actual = Search2DMatrix2.searchMatrix(matrix, target);
        assertFalse(actual);
    }

    @Test
    public void testSearchMatrixEmptyRow() {
        int[][] matrix = new int[][]{{}};
        int target = 5;
        boolean actual = Search2DMatrix2.searchMatrix(matrix, target);
        assertFalse(actual);
    }

    @Test
    public void testSearchMatrix5() {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean actual = Search2DMatrix2.searchMatrix(matrix, target);
        assertTrue(actual);
    }

    @Test
    public void testSearchMatrix20() {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        boolean actual = Search2DMatrix2.searchMatrix(matrix, target);
        assertFalse(actual);
    }
}
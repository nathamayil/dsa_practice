/*Given an 'N' x 'M'integer matrix, if an element is o, set its entire row and column to O's, and return the matrix. In particular, your task is to modify it in such a way that if a cell has a value 0 (matrix[i] () == 0), then all the cells of the ith row and jth column should be changed to 0.
You must do it in place.
For Example:
If the given grid is this: [7, 19, 3] [4, 21, 0]
Then the modified grid will be: [7, 19, 0] [0, 0, 0]*/



import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
    }

}}

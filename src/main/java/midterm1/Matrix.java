package midterm1;

import java.util.ArrayList;

public class Matrix {

    public static int numberOfNonZeroValues(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] matrix) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean sameValue = true;
            for (int j = i; j < matrix.length; j++) {
                if (matrix[j][i] != matrix[0][i]) {
                    sameValue = false;
                    break;
                }
            }
            if (sameValue) {
                results.add(i);
            }
        }
        return results;
    }
}

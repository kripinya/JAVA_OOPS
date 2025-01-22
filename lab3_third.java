
public class lab3_third {

    public static int[][] spiral(int matrix[][]) {
        int m = matrix.length, n = matrix[0].length;
        int[][] spiralMatrix = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int num = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiralMatrix[top][i] = num++;
                visited[top][i] = true;
            }
            top++;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralMatrix[bottom][i] = num++;
                    visited[bottom][i] = true;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralMatrix[i][left] = num++;
                    visited[i][left] = true;
                }
                left++;
            }
        }
        return spiralMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] spiralMatrix = spiral(matrix);
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix[i].length; j++) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

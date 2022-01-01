public class Transpose {
    public int[][] transpose(int matrix[][], int row, int col)
    {
        int i, j;
        int [][] transposedMatrix = new int[row][col];

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }
}

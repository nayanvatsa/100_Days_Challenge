class prog {


    static void rotateMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top < bottom && left < right) {

          
            int prev = mat[top + 1][left];

           
            for (int i = left; i <= right; i++) {
                int curr = mat[top][i];
                mat[top][i] = prev;
                prev = curr;
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                int curr = mat[i][right];
                mat[i][right] = prev;
                prev = curr;
            }
            right--;

            
            for (int i = right; i >= left; i--) {
                int curr = mat[bottom][i];
                mat[bottom][i] = prev;
                prev = curr;
            }
            bottom--;

            // Move left column elements
            for (int i = bottom; i >= top; i--) {
                int curr = mat[i][left];
                mat[i][left] = prev;
                prev = curr;
            }
            left++;
        }
    }

    
    static void printMatrix(int[][] mat) {

        for (int[] row : mat) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateMatrix(mat);
        printMatrix(mat);
    }
}

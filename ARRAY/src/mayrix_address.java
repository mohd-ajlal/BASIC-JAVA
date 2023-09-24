public class mayrix_address {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        System.out.println(matrix);
        System.out.println(matrix[0]);
        System.out.println(matrix[1]);
        System.out.println(matrix[2]);

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

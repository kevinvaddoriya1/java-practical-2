import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = 3;
        int col1 = 3;
        int row2 = 3;
        int col2 = 4;
        if (col1 == row2) {
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            int c[][] = new int[row1][col2];

            System.out.println("Enter elements of first matrix : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix : ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            System.out.println("First matrix is : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Second matrix is : ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Multiplication of two matrices is : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    c[i][j] = 0;
                    for (int j2 = 0; j2 < col1; j2++) {
                        c[i][j] += a[i][j2] * b[j2][j];
                    }
                }
            }

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        } 
        sc.close();
    }
}

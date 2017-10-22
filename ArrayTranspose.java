import java.util.*;

public class ArrayTranspose {
    
    public static void Printmatrix(int [][] arr){
        for (int[] row : arr) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println("");
       }
    }
    public static void transposematrix(int [][] arr){
        int m = arr.length;
        int n = arr[0].length;

        int[][] trasposedMatrix = new int[n][m];

        for(int x = 0; x < n; x++)
        {
            for(int y = 0; y < m; y++)
            {
                trasposedMatrix[x][y] = arr[y][x];
            }
        }
        System.out.println("after transpose: ");
        Printmatrix(trasposedMatrix);
    }
    
    public static void main(String args[]){
        int a[][]=new int[3][3];
         Scanner input = new Scanner(System.in);

        for(int row=0;row<3;row++){

            for(int col=0;col<3;col++){
                System.out.println("Enter value: ");
                a[row][col]=input.nextInt();
            }
        }
        Printmatrix(a);
        transposematrix(a);
        
    }
}

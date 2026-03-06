package Practice;

public class Matrix {

    public static void main(String[] args) {

        int A[][] = {
            {1, 5, 2},
            {4, 6, 7},
            {1, 3, 8}
        };

        int B[][] = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows=A.length;
        int cols =B.length;
        int result[][]= new int[rows][cols];

        // addition
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         result[i][j]=A[i][j]+B[i][j];
        //          System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // multiply
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                for(int k=0;k<cols;k++){
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
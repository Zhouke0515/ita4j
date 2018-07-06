package demo.zhouke.ita4j.chapter4;

/**
 * Create By Zhouke on 2018/07/05
 */
public class Matrix {

    public int[][] squareMatrixMultiply(int[][] a, int[][] b){
        int rows = a.length;
        int cols = a[0].length;

        int rows2 = b.length;
        int cols2 = b[0].length;

        int[][] c = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                c[i][j] = 0;
                for(int k=0; k<rows; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}


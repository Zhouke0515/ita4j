package demo.zhouke.ita4j.chapter4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/05
 */
public class MatrixTest {

    private Logger logger = LogManager.getLogger(this.getClass());
    private Matrix matrix;
    @Before
    public void setUp() throws Exception {
        matrix = new Matrix();
    }

    @Test
    public void squareMatrixMultiply() {
        int[][] a = {{2,3},{1,3}};
        int[][] b = {{2,4},{5,6}};
        int[][] c = matrix.squareMatrixMultiply(a, b);
        for (int i=0; i<c.length; i++) {
            for(int j=0; j< c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
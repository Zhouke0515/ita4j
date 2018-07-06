package demo.zhouke.ita4j.util;

import org.junit.Before;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/06/26
 */
public class ArrayUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createArray() {
        int[] array = ArrayUtil.createRandomArray(20);
        for (int item : array) {
            System.out.print(item + ", ");
        }
    }

    @Test
    public void subArray() {
        int[] testArray = null;
        try {
            int[] result = ArrayUtil.subArray(testArray, 0, 2);
            testArray = new int[0];
            result = ArrayUtil.subArray(testArray, 0, 0);
            testArray = new int[]{1, 2, 4, 5, 6};
            result = ArrayUtil.subArray(testArray, 0, 2);

            result = ArrayUtil.subArray(testArray, 4, 2);
            result = ArrayUtil.subArray(testArray, 1, 5);
        } catch (Exception e) {

        }

    }
}
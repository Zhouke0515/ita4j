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
        int[] array = ArrayUtil.createArray(20);
        for (int item : array) {
            System.out.print(item + ", ");
        }
    }
}
package demo.zhouke.ita4j.chapter8;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/06
 */
public class CountingSortTest {

    //private Logger logger = LogManager.getLogger(this.getClass());
    private CountingSort countingSort;
    private int[] array;
    private static final int ARRAY_LENGTH = 1000*1000;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(ARRAY_LENGTH);
        countingSort = new CountingSort();
    }

    @Test
    public void sortByDesc() {
    }

    @Test
    public void sortByAsc() {
        int[] result = countingSort.sortByAsc(array);
        for(int item : result) {
            System.out.print(item + " ");
        }
    }
}
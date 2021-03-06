package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/02
 */
public class SelectSortTest {
    private Logger logger = LogManager.getLogger(this.getClass());
    private SelectSort selectSort;
    private int[] array;
    private static final int ARRAY_LENGTH = 1000*1000;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(ARRAY_LENGTH);
        selectSort = new SelectSort(array);
    }
    @Test
    public void sortByDesc() {
        int[] result = selectSort.sortByDesc(array);
        for(int item : result) {
            System.out.print(item + ",");
        }
    }

    @Test
    public void sortByAsc() {
        long startTime = System.currentTimeMillis();
        logger.debug("start:{}", startTime);
        int[] result = selectSort.sortByAsc(array);
        long endTime = System.currentTimeMillis();
        logger.debug("end:{}", endTime);
        long cost = endTime - startTime;
        logger.debug("cost:{}", cost);
    }
}
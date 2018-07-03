package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Create By Zhouke on 2018/06/26
 */
public class InsertSortTest {

    private Logger logger = LogManager.getLogger(this.getClass());
    private InsertSort insertSort;
    private int[] array;
    private static final int ARRAY_LENGTH = 1000*100;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(ARRAY_LENGTH);
        insertSort = new InsertSort(array);
    }
    @org.junit.Test
    public void sortByAsc() {
        int[] result = insertSort.sortByAsc(array);
        for(int item : result) {
            System.out.print(item + ",");
        }
    }
    @org.junit.Test
    public void sortByDesc() {
        long startTime = System.currentTimeMillis();
        logger.debug("start:{}", startTime);
        int[] result = insertSort.sortByAsc(array);
        long endTime = System.currentTimeMillis();
        logger.debug("end:{}", endTime);
        long cost = endTime - startTime;
        logger.debug("cost:{}", cost);
    }

}
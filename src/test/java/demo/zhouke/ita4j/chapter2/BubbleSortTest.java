package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * 运行测试：
 * 10W-13374
 * 100W-
 * Create By Zhouke on 2018/07/03
 */
public class BubbleSortTest {

    private Logger logger = LogManager.getLogger(this.getClass());
    private BubbleSort bubbleSort;
    private int[] array;
    private static final int ARRAY_LENGTH = 1000*1000;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(ARRAY_LENGTH);
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sortByDesc() {
    }

    @Test
    public void sortByAsc() {
        long startTime = System.currentTimeMillis();
        logger.debug("start:{}", startTime);
        int[] result = bubbleSort.sortByAsc(array);
        long endTime = System.currentTimeMillis();
        logger.debug("end:{}", endTime);
        long cost = endTime - startTime;
        logger.debug("cost:{}", cost);
        logger.debug("{}",result);
    }
}
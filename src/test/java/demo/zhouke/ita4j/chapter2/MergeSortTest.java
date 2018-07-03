package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/03
 */
public class MergeSortTest {

    private Logger logger = LogManager.getLogger(this.getClass());
    private MergeSort mergeSort;
    private int[] array;
    private static final int ARRAY_LENGTH = 1000*100;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(ARRAY_LENGTH);
        mergeSort = new MergeSort();
    }

    @Test
    public void sortByDesc() {
    }

    @Test
    public void sortByAsc() {
        long startTime = System.currentTimeMillis();
        logger.debug("start:{}", startTime);
        int[] result = mergeSort.sortByAsc(array);
        long endTime = System.currentTimeMillis();
        logger.debug("end:{}", endTime);
        long cost = endTime - startTime;
        logger.debug("cost:{}", cost);
        int min = result[0];
        for(int item : result) {
            if(min > item){
                min = item;
            }
        }
        Assert.assertEquals(min,result[0]);
    }
}
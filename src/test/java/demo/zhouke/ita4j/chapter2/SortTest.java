package demo.zhouke.ita4j.chapter2;

import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/02
 */
public class SortTest {

    private InsertSort insertSort;
    @org.junit.Before
    public void setUp(){
        int[] array = {2,3,5,4,235,6,34,2};
        insertSort = new InsertSort(array);
    }

    @Test
    public void getMinValue() {
        int min = insertSort.getMinValue();
        System.out.println(min);
    }

    @Test
    public void getMaxValue() {
        int max = insertSort.getMaxValue();
        System.out.println(max);
    }
}
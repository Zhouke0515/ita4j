package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/02
 */
public class SelectSortTest {
    private SelectSort selectSort;
    private int[] array;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(100000);
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
        int[] result = selectSort.sortByAsc(array);
        for(int item : result) {
            System.out.print(item + ",");
        }
    }
}
package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/06/26
 */
public class InsertSortTest {

    private InsertSort insertSort;
    private int[] array;
    @org.junit.Before
    public void setUp(){
        array = ArrayUtil.createRandomArray(100000);
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
        int[] result = insertSort.sortByDesc(array);
        for(int item : result) {
            System.out.print(item + ",");
        }
    }

    @Test
    public void sortDAC() {
        int[] result = insertSort.sortDAC(array);
        for(int item : result) {
            System.out.print(item + ",");
        }
    }
}
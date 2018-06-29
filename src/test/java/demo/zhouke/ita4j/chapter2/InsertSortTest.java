package demo.zhouke.ita4j.chapter2;

import demo.zhouke.ita4j.util.ArrayUtil;

/**
 * Create By Zhouke on 2018/06/26
 */
public class InsertSortTest {

    private InsertSort insertSort;
    @org.junit.Before
    public void setup(){
        int[] array = ArrayUtil.createArray(100000);
        insertSort = new InsertSort(array);
    }
    @org.junit.Test
    public void sortByAsc() {
        int[] result = insertSort.sortByAsc();
        for(int item : result) {
            System.out.print(item + ",");
        }
    }
    @org.junit.Test
    public void sortByDesc() {
        int[] result = insertSort.sortByDesc();
        for(int item : result) {
            System.out.print(item + ",");
        }
    }
}
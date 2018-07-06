package demo.zhouke.ita4j.chapter7;

import demo.zhouke.ita4j.util.ArrayUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * Create By Zhouke on 2018/07/06
 */
public class QuickSortTest {
    private QuickSort quickSort;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        quickSort = new QuickSort();
        array = ArrayUtil.createRandomArray(10);
    }

    @Test
    public void sortByDesc() {
    }

    @Test
    public void sortByAsc() throws Exception {
        int[] array = new int[]{6, 2, 7, 3, 8, 9};
        int[] result = quickSort.sortByAsc(array);
        for(int item: result){
            System.out.print(item + " ");
        }
    }
}
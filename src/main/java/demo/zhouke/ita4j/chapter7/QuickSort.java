package demo.zhouke.ita4j.chapter7;

import demo.zhouke.ita4j.chapter2.Sort;

/**
 * Create By Zhouke on 2018/07/06
 */
public class QuickSort extends Sort {
    @Override
    public int[] sortByDesc(int[] array) {
        return new int[0];
    }

    @Override
    public int[] sortByAsc(int[] array) throws Exception {
        return sortByAsc(array, 0, array.length - 1);
    }

    public int[] sortByAsc(int[] array, int start, int end) throws Exception {
        int key = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (array[j] >= key && i < j) {
                j--;
            }
            while (array[i] <= key && i < j) {
                i++;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[0] = array[i];
        array[i] = key;

        if (i > 1) {
            sortByAsc(array, 0, i-1);

        }
        if (j + 1 < end){
            sortByAsc(array, j + 1, end);
        }
        return array;
    }
}

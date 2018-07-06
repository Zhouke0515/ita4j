package demo.zhouke.ita4j.chapter8;

import demo.zhouke.ita4j.chapter2.Sort;

/**
 * Create By Zhouke on 2018/07/06
 */
public class CountingSort extends Sort {
    @Override
    public int[] sortByDesc(int[] array) {
        return new int[0];
    }

    @Override
    public int[] sortByAsc(int[] array) {
        int[] result = new int[array.length];
        int max = array[0], min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        //这里k的大小是要排序的数组中，元素大小的极值差+1
        int k = max - min + 1;
        int[] copy = new int[k];
        for (int i = 0; i < array.length; ++i) {
            //优化过的地方，减小了数组c的大小
            copy[array[i] - min] += 1;
        }
        for (int i = 1; i < copy.length; ++i) {
            copy[i] = copy[i] + copy[i - 1];
        }
        for (int i = array.length - 1; i >= 0; --i) {
            //按存取的方式取出c的元素
            result[--copy[array[i] - min]] = array[i];
        }
        return result;
    }
}

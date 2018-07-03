package demo.zhouke.ita4j.chapter2;

/**
 * Create By Zhouke on 2018/07/03
 */
public class BubbleSort extends Sort {
    @Override
    public int[] sortByDesc(int[] array) {
        return new int[0];
    }

    @Override
    public int[] sortByAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                }
            }
        }
        return array;
    }
}

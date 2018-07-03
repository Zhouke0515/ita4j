package demo.zhouke.ita4j.chapter2;

/**
 * 归并排序
 * Create By Zhouke on 2018/07/03
 */
public class MergeSort extends Sort {

    //private Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public int[] sortByDesc(int[] array) {
        return new int[0];
    }

    @Override
    public int[] sortByAsc(int[] array) {
        //logger.info("待排序数组：{}", array);
        if (array.length > 1) {
            int[] left = new int[array.length / 2];
            int[] right = new int[array.length - left.length];
            for (int i = 0; i < left.length; i++) {
                left[i] = array[i];

            }
            //logger.info("左数组：{}", left);
            for (int i = left.length; i < array.length; i++) {
                right[i - left.length] = array[i];

            }
            //logger.info("右数组：{}", right);
            if (left.length > 1) {
               left = sortByAsc(left);
            }
            if (right.length > 1) {
               right = sortByAsc(right);
            }
            return merge(left, right);
        } else {
            return array;
        }
    }

    private int[] merge(int[] left, int[] right) {
        int[] mergeArray = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0;
        for (int i = 0; i < mergeArray.length; i++) {
            if (leftIndex >= left.length) {
                mergeArray[i] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex >= right.length) {
                mergeArray[i] = left[leftIndex];
                leftIndex++;
            } else if (right[rightIndex] > left[leftIndex]) {
                mergeArray[i] = left[leftIndex];
                leftIndex++;
            } else {
                mergeArray[i] = right[rightIndex];
                rightIndex++;
            }
        }
        //logger.info("合并后数组：{}", mergeArray);
        return mergeArray;
    }
}

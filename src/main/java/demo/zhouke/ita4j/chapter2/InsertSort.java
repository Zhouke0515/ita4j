package demo.zhouke.ita4j.chapter2;

/**
 * 插入排序
 * Create By Zhouke on 2018/06/26
 */
public class InsertSort extends Sort {

    public InsertSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sortByAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
//                if(key < array[j]){
                int temp = array[j];
                array[j] = key;
                array[j + 1] = temp;
//                }
                j--;
            }
        }
        return array;
    }

    @Override
    public int[] sortByDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key > array[j]) {
                int temp = array[j];
                array[j] = key;
                array[j + 1] = temp;
                j--;
            }
        }
        return array;
    }

    /**
     * divide and conquer 分而治之
     *
     * @return
     */
    public int[] sortDAC(int[] array) {
        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];
        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = right.length; i < array.length; i++) {
            right[i - right.length] = array[i];
        }
        if (left.length > 1000) {
            sortDAC(left);
        }
        if (right.length > 1000) {
            sortDAC(left);
        }
        sortByAsc(left);
        sortByAsc(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] mergeArray = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0;
        for (int i = 0; i < mergeArray.length; i++) {
            if (leftIndex < left.length && right[rightIndex] > left[leftIndex]) {
                mergeArray[i] = left[leftIndex];
                leftIndex++;
            } else {
                mergeArray[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return mergeArray;
    }
}

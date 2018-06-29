package demo.zhouke.ita4j.chapter2;

/**
 * 插入排序
 * Create By Zhouke on 2018/06/26
 */
public class InsertSort {
    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    public int[] sortByAsc() {
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

    public int[] sortByDesc(){
        for(int i=1; i<array.length; i++){
            int key = array[i];
            int j = i-1;
            while (j >=0 && key > array[j]){
                int temp = array[j];
                array[j] = key;
                array[j + 1] = temp;
                j--;
            }
        }
        return array;
    }
}

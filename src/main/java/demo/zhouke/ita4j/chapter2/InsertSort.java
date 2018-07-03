package demo.zhouke.ita4j.chapter2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 插入排序
 * Create By Zhouke on 2018/06/26
 */
public class InsertSort extends Sort {

    private Logger log = LogManager.getLogger(this.getClass());
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
        log.info("start at : {}", System.currentTimeMillis());
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
        log.info("end at : {}", System.currentTimeMillis());
        return array;
    }


}

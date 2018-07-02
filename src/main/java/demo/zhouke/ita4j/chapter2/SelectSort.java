package demo.zhouke.ita4j.chapter2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 习题2.2-2 选择排序
 * Create By Zhouke on 2018/07/02
 */
public class SelectSort extends Sort {

    private Logger log = LogManager.getLogger(this.getClass());

    public SelectSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sortByDesc(int[] array) {
        for(int i=0; i< array.length-1; i++){
            int temp = array[i];
            for(int j=i; j<array.length; j++){
                if(array[j] > temp){
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[i];
                }
            }
        }
        return array;
    }

    @Override
    public int[] sortByAsc(int[] array) {
        for(int i=0; i< array.length-1; i++){
            int temp = array[i];
            for(int j=i; j<array.length; j++){
                if(array[j] < temp){
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[i];
                }
            }
        }
        return array;
    }


}

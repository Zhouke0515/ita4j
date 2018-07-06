package demo.zhouke.ita4j.chapter2;

/**
 * Create By Zhouke on 2018/07/02
 */
public abstract class Sort {
    protected int[] array;
    abstract public int[] sortByDesc(int[] array);
    abstract public int[] sortByAsc(int[] array) throws Exception;

    public int getMinValue(){
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < temp){
                temp = array[i];
            }
        }
        return temp;
    }

    public int getMaxValue(){
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > temp){
                temp = array[i];
            }
        }
        return temp;
    }
}

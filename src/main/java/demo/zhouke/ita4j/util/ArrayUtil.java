package demo.zhouke.ita4j.util;

/**
 * Create By Zhouke on 2018/06/26
 */
public class ArrayUtil {
    private static final int RANDOM_SIZE = 100;

    /**
     * 随机数生成一个指定长度的整形数组
     *
     * @param length 数组长度
     * @return 整形数组
     */
    public static final int[] createArray(int length) {
        int[] array = new int[length];
        while (length > 0) {
            int randNumber = (int) (Math.random() * RANDOM_SIZE * length);
            array[length - 1] = randNumber;
            length--;
        }
        return array;
    }
}

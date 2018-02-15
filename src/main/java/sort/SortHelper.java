package sort;

/**
 * created by eric on 18-2-13
 */
public class SortHelper {

    /**
     * 元素互换
     *
     * @param index1 第一个元素索引
     * @param index2 第二个元素索引
     * @param <T>    元素类型
     */
    public static <T> void swap(T[] source, int index1, int index2) {
        T temp = source[index1];
        source[index1] = source[index2];
        source[index2] = temp;
    }
}

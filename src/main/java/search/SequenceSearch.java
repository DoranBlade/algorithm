package search;

/**
 * 顺序查找
 * created by eric on 18-2-14
 */
public class SequenceSearch {

    public static <T> int search(T[] source, T value) {
        if (source == null || source.length == 0) {
            return -1;
        }
        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}

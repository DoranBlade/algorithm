package net.usepower.algorithm.search;

/**
 * 顺序查找
 * created by eric on 18-2-14
 */
class SequenceSearch {

    int search(int[] source, int value) {
        if (source == null || source.length == 0) {
            return -1;
        }
        for (int i = 0; i < source.length; i++) {
            if (source[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

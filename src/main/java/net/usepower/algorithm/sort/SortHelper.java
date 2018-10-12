package net.usepower.algorithm.sort;

import com.github.javafaker.Faker;

/**
 * created by eric on 18-2-13
 */
public class SortHelper {

    private static final Faker faker = new Faker();

    /**
     * 元素互换
     *
     * @param index1 第一个元素索引
     * @param index2 第二个元素索引
     */
    public static void swap(int[] source, int index1, int index2) {
        int temp = source[index1];
        source[index1] = source[index2];
        source[index2] = temp;
    }

    public static int getRandom() {
        return faker.number().numberBetween(1 , 100000);
    }

    public static int[] getDefaultSizeArray() {
        return getArray(10000);
    }

    /**
     * 创建指定数量的测试数据
     * @param size 数据数量
     * @return 测试数据
     */
    public static int[] getArray(int size) {
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = faker.number().numberBetween(1, size * 100);
        }
        return res;
    }

    /**
     * 数组元素呈升序排序
     *
     * @param source 源数据
     */
    public static boolean isAsc(int[] source) {
        for (int i = 1; i < source.length; i++) {
             if (source[i] - source[i - 1] < 0) {
                 return false;
             }
        }
        return true;
    }

    /**
     * 数组元素呈降序排序
     *
     * @param source 源数据
     */
    public static boolean isDesc(int[] source) {
        for (int i = 1; i < source.length; i++) {
            if (source[i] - source[i - 1] > 0) {
                return false;
            }
        }
        return true;
    }

}

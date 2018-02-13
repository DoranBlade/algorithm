package sort;

import Model.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

/**
 * 断言结果
 * created by eric on 18-2-13
 */
public class AssertUtils {

    /**
     * 数组元素呈升序排序
     * @param source 源数据
     */
    public static void isAsc(Person[] source) {
        for (int i = 1; i < source.length; i++) {
            Assert.assertThat(source[i].getAge() - source[i - 1].getAge() >= 0, CoreMatchers.is(true));
        }
    }

    /**
     * 数组元素呈降序排序
     * @param source 源数据
     */
    public static void isDesc(Person[] source) {
        for (int i = 1; i < source.length; i++) {
            Assert.assertThat(source[i].getAge() - source[i - 1].getAge() <= 0, CoreMatchers.is(true));
        }
    }
}

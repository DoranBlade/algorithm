package Model;

/**
 * created by eric on 18-2-13
 */
public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public static Person[] list(int size) {
        Person[] result = new Person[size];
        for (int i = 0; i < size; i++) {
            result[i] = instance();
        }
        return result;
    }

    /**
     * faker单个实例
     * @return 实例
     */
    public static Person instance() {
        return new Person(FakerUtils.faker.name().firstName(), FakerUtils.faker.number().numberBetween(1, 100));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

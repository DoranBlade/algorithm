package Model;

import search.SearchKey;

/**
 * created by eric on 18-2-13
 */
public class Person implements Comparable<Person>, SearchKey {

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
        return new Person(FakerUtils.faker.name().firstName(), FakerUtils.faker.number().numberBetween(1, 1000));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return age != null ? age.equals(person.age) : person.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person person) {
        return this.getAge() - person.getAge();
    }

    @Override
    public int getKey() {
        return getAge();
    }
}

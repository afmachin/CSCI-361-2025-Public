package assignments.sorting_algorithms.merge_sort;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " " + age;
    }
}

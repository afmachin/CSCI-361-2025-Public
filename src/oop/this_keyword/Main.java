package oop.this_keyword;

public class Main {
    public static void main(String[] args) {
        Person mike = new Person();
        mike.setName("Mike");
        Person anthony;
        anthony = new Person();
        anthony.setName("Anthony");

        System.out.println(anthony.getName());
    }
}

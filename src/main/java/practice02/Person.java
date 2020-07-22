package practice02;

public class Person {
    protected String name;
    protected int age;

    public String introduce() {
        return ("My name is " + name + ". I am " + age + " years old.");
        //My name is Tom. I am 21 years old.
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

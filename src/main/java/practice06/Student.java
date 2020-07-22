package practice06;

public class Student extends Person {

    private int Class;

    public Student(String name, int age, int Class) {
        super(name, age);
        this.Class = Class;
    }

    public String introduce() {
        return ("My name is "+name+". I am "+age+" years old. I am a Student. I am at Class "+Class+".");
    }

    public int getKlass() {
        return Class;
    }
}

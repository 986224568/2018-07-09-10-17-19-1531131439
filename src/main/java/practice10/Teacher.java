package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public String introduce() {
        if (classes == null || classes.size() == 0) {
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }
        String Klasses = classes.stream().map(e -> e.getNumber()).collect(Collectors.toList()).toString();
        return (super.introduce() + " I am a Teacher. I teach Class "+ Klasses.substring(1,Klasses.length() - 1) +".");
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.classes.getFirst().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return this.classes.contains(student.getKlass());
    }
}
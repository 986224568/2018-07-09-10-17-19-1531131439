package practice11;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person implements Observer{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.addObserver(this);
        }
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

    @Override
    public void update(int state, Student student) {
        if (state == State.addLeader.getIndex()) {
            System.out.print("I am " + this.name + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
        } else if (state == State.addMember.getIndex()) {
            System.out.print("I am " + this.name + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
        }
    }
}
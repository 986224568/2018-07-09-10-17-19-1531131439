package practice11;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private Observer observer;

    private ArrayList<Observer> observers = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (!this.equals(student.getKlass())) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        notifyObserver(State.addLeader.getIndex(), student);
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        notifyObserver(State.addMember.getIndex(), student);
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObserver(int state, Student student) {
        for(Observer observer : this.observers) {
            observer.update(state, student);
        }
    }

}
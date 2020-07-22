package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public String introduce() {
        if (klass == null) {
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }
        return (super.introduce() + " I am a Teacher. I teach Class "+ klass.getNumber() +".");
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
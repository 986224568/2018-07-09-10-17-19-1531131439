package practice06;

public class Teacher extends Person {
    private int klass;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = 0;
    }

    public String introduce() {
        if (klass == 0) {
            return ("My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.");
        }
        return ("My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class "+klass+".");
    }

    public int getKlass() {
        return klass;
    }
}

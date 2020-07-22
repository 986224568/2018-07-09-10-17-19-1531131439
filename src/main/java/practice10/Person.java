package practice10;

public class Person {
    protected int id;
    protected String name;
    protected int age;


    public String introduce() {
        return ("My name is "+ name +". I am "+ age +" years old.");
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object ob) {
        //自反性
        if (this == ob) {
            return true;
        }
        //instanceof比较判断是否是同一类或者子父类关系
        if (!(ob instanceof Person)) {
            return false;
        }
        //判断是同一类或者子父类关系，再将Object类型强转为Person
        Person ob1 = (Person) ob;
        return this.id == ob1.id;
    }
}
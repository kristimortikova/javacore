package center.kit.app.classwork.lesson9;

public class Person {
    protected String name;
    protected int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public int EndOfTrainingTime() {
        age = age + 6;
        System.out.println(age);
        return age;
    }

}

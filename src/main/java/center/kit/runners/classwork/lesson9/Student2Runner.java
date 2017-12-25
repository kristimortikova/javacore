package center.kit.runners.classwork.lesson9;


import center.kit.app.classwork.lesson9.Person2;
import center.kit.app.classwork.lesson9.Student2;
import center.kit.app.classwork.lesson9.Teacher;

public class Student2Runner {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        Person2 student = new Student2();
        person2Action(student);
        Person2 teacher = new Teacher();
        person2Action(teacher);
    }

    public static void person2Action(Person2 person2) {
        person2.showName();
        person2.showAge();
    }
}

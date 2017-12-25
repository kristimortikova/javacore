package center.kit.app.homework.lesson9;

public class Student3 extends Person3 {
    public Student3(String name, String university, int age) {
        super(name, age, university);
    }

    @Override
    public void showDegree() {
        System.out.println("Student's degree ");
    }
}

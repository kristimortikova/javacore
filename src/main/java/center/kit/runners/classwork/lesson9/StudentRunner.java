package center.kit.runners.classwork.lesson9;

import center.kit.app.classwork.lesson9.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student(20, "hbh");
        Student nameS = new Student("Roma", "Harvard");
        student.EndOfTrainingTime();
        nameS.setResponse("yes");

    }
}

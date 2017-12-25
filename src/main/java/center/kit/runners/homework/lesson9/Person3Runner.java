package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Lecturer;
import center.kit.app.homework.lesson9.Person3;
import center.kit.app.homework.lesson9.Student3;

public class Person3Runner {
    public static void main(String[] args) {
        Person3 person3 = new Person3("Oleg", 50, "MSU");
        Person3 lecturer = new Lecturer("Oleg", 50, "MSU", "Biology", 15, "Ph.D");
        ((Lecturer) lecturer).infoLecturer();
        showDegreeRun(lecturer);
        Person3 student = new Student3("Roman", "MSU", 20);
        showDegreeRun(student);

    }

    public static void showDegreeRun(Person3 person3) {
        person3.showDegree();
    }
}


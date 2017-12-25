package center.kit.app.homework.lesson9;

public class Lecturer extends Person3 {
    private String faculty;
    private int experience;
    private String degree;

    public Lecturer(String name, int age, String university, String faculty, int experience, String degree) {
        super(name, age, university);
        this.faculty = faculty;
        this.experience = experience;
        this.degree = degree;
    }

    public void infoLecturer() {
        System.out.println("Lecturer's info; name: " + name + ",  university: " + university + ", age: " + age + ", faculty: " + faculty + ", experience: " + experience + ", degree: " + degree);
    }

    @Override
    public void showDegree() {
        System.out.println("Lecturer's degree ");
    }
}

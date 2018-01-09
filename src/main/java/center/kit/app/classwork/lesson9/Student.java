package center.kit.app.classwork.lesson9;

public class Student extends Person {
    private String university;
    private String response;
    private String teacher;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public Student(int age, String teacher) {
        super(age);
        this.teacher = teacher;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
        System.out.println(response);
    }
}

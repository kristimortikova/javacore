package center.kit.app.homework.lesson9;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        System.out.println("age is " + age);
        return age;

    }

    public void setAge(int age) {
        if (age > 0) {
            if (age <= 120) {
                this.age = age;
                System.out.println("New age setted: " + age);
            } else {
                System.out.println("age invalid");
            }

        } else System.out.println("age invalid");
    }

    public String getName() {
        System.out.println("name is " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("New name setted: " + name);
    }
}

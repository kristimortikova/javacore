package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Human;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human(45, "Oleg");
        human.getAge();
        human.getName();
        human.setAge(8);
        human.setName("Roman");
    }


}

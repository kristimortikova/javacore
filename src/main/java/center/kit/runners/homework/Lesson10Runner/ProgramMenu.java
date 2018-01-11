package center.kit.runners.homework.Lesson10Runner;

import center.kit.app.homework.lesson10.ProgramMenuEnum;
import center.kit.runners.homework.lesson4.HomeTask4Runner;
import center.kit.runners.homework.lesson6.HomeTask6Runner;
import center.kit.runners.homework.lesson7.HomeTask7Runner;
import center.kit.runners.homework.lesson8.HomeTask8Runner;

import java.util.Scanner;

public class ProgramMenu {
    public static void main(String[] args) {
        System.out.println("Available items: ");
        for (ProgramMenuEnum menu : ProgramMenuEnum.values()) {
            System.out.println(menu.getFullName());
        }
        System.out.println("Enter any number: one, two, three, four or exit ");
        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.next();
        if (ProgramMenuEnum.printType(input2)) {
            ProgramMenuEnum task = ProgramMenuEnum.valueOf(input2.toUpperCase());
            switch (task) {
                case ONE:
                    System.out.println("Menu - Home task lesson 4: ");
                    HomeTask4Runner.main(null);
                    break;
                case TWO:
                    System.out.println("Menu - Home task lesson 6: ");
                    HomeTask6Runner.main(null);
                    break;
                case THREE:
                    System.out.println("Menu - Home task lesson 7: ");
                    HomeTask7Runner.main(null);
                    break;
                case FOUR:
                    System.out.println("Menu - Home task lesson 4: ");
                    HomeTask8Runner.main(null);
                    break;
                case EXIT:
                    System.out.println("Good buy!");
                    break;
            }
        } else {
            System.out.println("There isn't such number in menu.\nEnter any number: one, two, three, four or exit ");

        }
    }
}

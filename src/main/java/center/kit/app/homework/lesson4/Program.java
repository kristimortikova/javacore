package center.kit.app.homework.lesson4;

import center.kit.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

import static center.kit.app.homework.lesson4.Lesson4Enum.EXIT;

public class Program {
    public static void ProgramMenu() {
        boolean check;
        while (check = true) {
            System.out.println("Available items: ");
            for (Lesson4Enum menu : Lesson4Enum.values()) {
                System.out.println(menu.getTaskName());
            }
            System.out.println("Enter any number: one, two, three or exit ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (Lesson4Enum.printType(input)) {
                Lesson4Enum task = Lesson4Enum.valueOf(input.toUpperCase());
                switch (task) {
                    case ONE:
                        Triangle.SideTriangle();
                        break;
                    case TWO:
                        CircleArea.calculate();
                        break;
                    case THREE:
                        DefineBigger.Define();
                        break;
                    case FOUR:
                        OddEven.OddOrEven();
                        break;
                    case EXIT:
                        System.out.println("Good Buy!");
                        break;
                }

                System.out.println(" ");
                if (task == EXIT) {
                    break;
                } else {
                    System.out.println("There isn't such number in menu.\nEnter any number: one, two, three, four or exit ");
                }
            }
        }
    }
}
package center.kit.runners.homework.lesson6;

import center.kit.app.homework.lesson6.*;

import java.util.Scanner;

public class HomeTask6Runner {
    public static void main(String[] Args) {
        System.out.println("Available items: ");
        for (Lesson6Enum menu : Lesson6Enum.values()) {
            System.out.println(menu.getTaskName());
        }
        System.out.println("Enter any number: one, two, three, four, five or exit ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (Lesson6Enum.printType(input)) {
            Lesson6Enum task = Lesson6Enum.valueOf(input.toUpperCase());
            switch (task) {
                case ONE:
                    Array1 array1 = new Array1();
                    array1.arr(2, 20, true);
                    array1.arr(2, 20, false);
                    break;
                case TWO:
                    Array2 array2 = new Array2();
                    array2.arr(1, 99);
                    break;
                case THREE:
                    Array3 array3 = new Array3();
                    array3.numb();
                    break;
                case FOUR:
                    Array4 array4 = new Array4();
                    array4.Arr();
                    break;
                case FIVE:
                    Array5 array5 = new Array5();
                    array5.Arr();
                    break;
                case EXIT:
                    System.out.println("Good Buy!");
                    break;
            }
        } else {
            System.out.println("There isn't such number in menu.\nEnter any number: one, two, three, four, five or exit ");
        }
    }
}



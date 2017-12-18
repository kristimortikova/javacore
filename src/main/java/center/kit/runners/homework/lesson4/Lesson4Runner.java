package center.kit.runners.homework.lesson4;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;
import center.kit.app.homework.lesson5.*;

import java.util.Scanner;

public class Lesson4Runner {
    public static void main(String[] args) {
        System.out.print("Введите число от 1 до 11 включительно");
        System.out.println(", чтобы запустить следущие классы: ");
        System.out.println("1 - class Box");
        System.out.println("2 - class PrimitiveConvertor");
        System.out.println("3 - class DogSize");
        System.out.println("4 - class Example");
        System.out.println("5 - class MessageUtil");
        System.out.println("6 - class NewNarrowing");
        System.out.println("7 - class NewTest7");
        System.out.println("8 - class NewTest8");
        System.out.println("9 - class NewTest9");
        System.out.println("10 - class NewTest10");
        System.out.println("11 - class NewWindening");
        System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        Integer clickNumber = scanner.nextInt();
        if (clickNumber == 1) {
            Box box = new Box();
            box.volume(12, 3, 5);
        } else if (clickNumber == 2) {
            PrimitiveConvertor primitive = new PrimitiveConvertor();
            float float1 = 5.328f;
            int int1 = 7;
            char char1 = 38;
            primitive.floatToChar(float1);
            primitive.intToChar(int1);
            primitive.charToInt(char1);
        } else if (clickNumber == 3) {
            DogSize dogSize = new DogSize();
            dogSize.setDog(15);
        } else if (clickNumber == 4) {
            Example example = new Example();
            example.setcycle(5);
        } else if (clickNumber == 5) {
            MessageUtil messageUtil = new MessageUtil();
            messageUtil.printMessage("name");
        } else if (clickNumber == 6) {
            NewNarrowing newNarrowing = new NewNarrowing();
            newNarrowing.narrowing();
        } else if (clickNumber == 7) {
            NewTest7 newTest7 = new NewTest7();
            newTest7.Time(6);
        } else if (clickNumber == 8) {
            NewTest8 newTest8 = new NewTest8();
            newTest8.func();
        } else if (clickNumber == 9) {
            NewTest9 newTest9 = new NewTest9();
            newTest9.Sum();
        } else if (clickNumber == 10) {

            NewTest10 newTest10 = new NewTest10();
            newTest10.CircleArea();
        } else if (clickNumber == 11) {
            NewWindening newWindening = new NewWindening();
            newWindening.Windening();
        } else {
            System.out.println("incorrect number");


        }
    }
}

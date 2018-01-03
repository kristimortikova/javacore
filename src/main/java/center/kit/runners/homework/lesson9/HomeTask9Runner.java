package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.*;

import java.util.Scanner;

import static center.kit.runners.homework.lesson9.ComputerRunner.changesForComputers;
import static center.kit.runners.homework.lesson9.Person3Runner.showDegreeRun;

public class HomeTask9Runner {
    public static void main(String[] args) {
        boolean check;

        System.out.println("Enter number 1 for to runner the class Person3.");
        System.out.println("Enter number 2 for to runner the class Computer.");
        System.out.println("Enter number 3 for to runner the class WhiteCollar.");
        System.out.println("Enter number 4 for to runner the class Human.");
        System.out.println("Enter number 5 for to runner the class Bicycle2.");
        while (check = true) {
            System.out.println("Enter number:");
            System.out.println("Enter 0 for exit.");
            Scanner scanner = new Scanner(System.in);
            try {
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        Person3 person3 = new Person3("Oleg", 50, "MSU");
                        Person3 lecturer = new Lecturer("Oleg", 50, "MSU", "Biology", 30, "Ph.D");
                        ((Lecturer) lecturer).infoLecturer();
                        showDegreeRun(lecturer);
                        Person3 student = new Student3("Roman", "MSU", 20);
                        showDegreeRun(student);
                        break;
                    case 2:
                        Computer computer = new Computer();
                        Lenovo lenovo = new Lenovo();
                        changesForComputers(lenovo);
                        DELL dell = new DELL();
                        changesForComputers(dell);
                        Computer[] changesForComputersArray = new Computer[2];
                        changesForComputersArray[0] = new Lenovo();
                        changesForComputersArray[1] = new DELL();
                        break;
                    case 3:
                        WhiteCollar whiteCollar = new WhiteCollar(35, "oleg", "ghg");
                        whiteCollar.setCompany("ghb");
                        break;
                    case 4:
                        Human human = new Human(45, "Oleg");
                        human.getAge();
                        human.getName();
                        human.setAge(8);
                        human.setName("Roman");
                        break;
                    case 5:
                        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing();
                        bicycleWithRing.ring();
                        Bicycle2 customBicycle2 = new CustomBicycle2();
                        customBicycle2.setGear(2);
                        customBicycle2.ride();
                        break;
                    case 0:
                        System.out.println("Good Buy!");
                        break;
                    default:
                        System.out.println("There isn't such number in menu.");
                        break;
                }
                if (number == 0) {
                    break;
                } else {
                    System.out.println("Continue..");
                }
            } catch (Exception e) {
                System.out.println("Incorrect value..");
            }
        }
    }
}

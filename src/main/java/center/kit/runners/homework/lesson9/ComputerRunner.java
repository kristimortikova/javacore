package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Computer;
import center.kit.app.homework.lesson9.DELL;
import center.kit.app.homework.lesson9.Lenovo;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Lenovo lenovo = new Lenovo();
        changesForComputers(lenovo);
        DELL dell = new DELL();
        changesForComputers(dell);
        Computer[] changesForComputersArray = new Computer[2];
        changesForComputersArray[0] = new Lenovo();
        changesForComputersArray[1] = new DELL();
    }

    public static void changesForComputers(Computer computer) {
        computer.changeCPU();
    }
}

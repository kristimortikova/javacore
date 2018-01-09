package center.kit.runners.classwork.lesson10;

import center.kit.app.classwork.lesson10.FileRd;
import center.kit.app.classwork.lesson10.Reader;

public class ReaderRunner {
    public static void main(String[] args) {
        FileRd fileRd = new FileRd();
        fileRd.source = "D://KIT";
        fileRd.read("Local");
        fileRd.printSourceOfReading();
        Reader fileRd1 = new FileRd();
        fileRd1.printSourceOfReading();
    }
}

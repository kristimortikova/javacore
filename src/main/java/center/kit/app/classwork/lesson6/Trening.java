package center.kit.app.classwork.lesson6;

public class Trening {
    public void Arr() {
        int[][] intArray = new int[2][3];
        for (int h = 0; h < intArray.length; h++) {
            for (int c = 0; c < intArray[h].length; c++) {
                intArray[h][c] = h * c;
                System.out.println("intArray[h][c] " + h + c);
            }
        }

    }
}

package center.kit.app.classwork.lesson7;

public class StringCasting {
    public void Casting() {
        String toInt = "123";
        int x = Integer.valueOf(toInt);
        System.out.println("int " + x);

        double fl = 111.111;
        String abc = String.valueOf(fl);
        System.out.println("string " + abc);

        String adc = "111.111";
        double f = Double.valueOf(adc);
        System.out.println("double " + f);

        double dot = 1000.0002;
        String doubleValue = String.valueOf(dot);
        System.out.println("string " + doubleValue);

        String toFloat = "0.44";
        float fin = Float.valueOf(toFloat);
        System.out.println("float " + fin);

        float name = 0.18f;
        String to = String.valueOf(name);
        System.out.println("string " + to);

        Integer val = new Integer(105);
        String valint = String.valueOf(val);
        System.out.println("string " + valint);

        String str = new String("6879");
        long s = Long.valueOf(str);
        System.out.println("long " + s);

        String ct = "I love ";
        String ct2 = "a cats";
        ct = ct.concat(ct2);
        System.out.println(ct);
    }
}

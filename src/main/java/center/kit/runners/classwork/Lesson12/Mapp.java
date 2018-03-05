package center.kit.runners.classwork.Lesson12;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Sim", "12");
        m1.put("Chris", "22");
        System.out.println(m1.get("Zara"));
        System.out.print(" Map Elements");
        System.out.print("\t" + m1);
    }
}

package center.kit.runners.classwork.lesson11;

import center.kit.app.classwork.lesson11.Holidays;

public class HolidaysRunner {
    public static void main(String[] args) {
        for (Holidays value : Holidays.values()) {
            System.out.println(value.getHoliday() + " holiday is on " + value.getMonth() + ", " + value.getValue());
        }
    }
}

package center.kit.app.homework.lesson10;

public enum ProgramMenuEnum {
    ONE("Home task lesson 4"),
    TWO("Home task lesson 6"),
    THREE("Home task lesson 7"),
    FOUR("Home task lesson 8"),
    EXIT("Exit");
    private String taskName;

    ProgramMenuEnum(String taskName) {
        this.taskName = taskName;
    }

    public static boolean printType(String input) {
        boolean check = false;
        for (ProgramMenuEnum menu : values()) {
            if (menu.name().equalsIgnoreCase(input)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public String getFullName() {
        return taskName;
    }


}

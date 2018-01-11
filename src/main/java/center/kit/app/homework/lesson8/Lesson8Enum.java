package center.kit.app.homework.lesson8;

public enum Lesson8Enum {
    ONE("Class ReadFile1"),
    TWO("Class ReadFile2"),
    THREE("ClassReadFile3"),
    EXIT("Exit");
    private String taskName;

    Lesson8Enum(String taskName) {
        this.taskName = taskName;
    }

    public static boolean printType(String input) {
        boolean check = false;
        for (Lesson8Enum menu : values()) {
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

package center.kit.app.homework.lesson4;

public enum Lesson4Enum {
    ONE("Right-angled triangle program"), TWO("Calculate circle area program"),
    THREE("Define which number is bigger or smaller"), FOUR("Define an even or odd number"), EXIT("Exit");
    private String taskName;

    Lesson4Enum(String taskName) {
        this.taskName = taskName;
    }

    public static boolean printType(String input) {
        boolean check = false;
        for (Lesson4Enum menu : values()) {
            if (menu.name().equalsIgnoreCase(input)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public String getTaskName() {
        return taskName;
    }
}

package center.kit.app.homework.lesson7;

public enum Lesson7Enum {
    ONE("Class Strin."),
    TWO("Class Palindrome1"),
    THREE("Class Palindrome2and3"),
    EXIT("Exit");
    private String taskName;

    Lesson7Enum(String taskName) {
        this.taskName = taskName;
    }

    public static boolean printType(String input) {
        boolean check = false;
        for (Lesson7Enum menu : values()) {
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


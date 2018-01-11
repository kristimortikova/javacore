package center.kit.app.homework.lesson6;

public enum Lesson6Enum {
    ONE("Class Array1"), TWO("Class Array2"), THREE("Class Array3"), FOUR("Class Array4"), FIVE("Class Array5"), EXIT("Exit");
    private String taskName;

    Lesson6Enum(String taskName) {
        this.taskName = taskName;
    }

    public static boolean printType(String input) {
        boolean check = false;
        for (Lesson6Enum menu : values()) {
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

package center.kit.runners.homework;

import center.kit.runners.homework.lesson6.HomeTask6Runner;

public enum TaskRunner {
    TASK_RUNNER(4, 6, 7, 8, 9);
    int homeTask4;
    int homeTask6;
    int homeTask7;
    int homeTask8;
    int homeTask9;

    TaskRunner(int homeTask4, int homeTask6, int homeTask7, int homeTask8, int homeTask9) {
        this.homeTask4 = homeTask4;
        this.homeTask6 = homeTask6;
        this.homeTask7 = homeTask7;
        this.homeTask8 = homeTask8;
        this.homeTask9 = homeTask9;
    }

    public static void main(String[] args) {
        HomeTask6Runner.main();

    }
}

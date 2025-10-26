# PomodoroMain.java
public class PomodoroMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pomodoro Timer.");

        // example 1: Basic Pomodoro (1 cycle)
        Pomodoro basic = new Pomodoro(1);
        basic.start();

        System.out.println("\n=============================\n");

        // Example 2: Smart Pomodoro (2 cycles, long break every 2 cycles)
        SmartPomodoro smart = new SmartPomodoro(2, 15, 2);
        smart.start();
    }
}

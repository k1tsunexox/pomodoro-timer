// Pomodoro.java
public class Pomodoro {
    protected TimerSession[] sessions;
    protected int currentSession;

    public Pomodoro(int totalCycles) {
        sessions = new TimerSession[totalCycles * 2];
        int index = 0;

        // Each cycle: Work + Break
        for (int i = 0; i < totalCycles; i++) {
            sessions[index++] = new TimerSession("Work", 25); // 25-minute work session
            sessions[index++] = new TimerSession("Break", 5); // 5-minute short break
        }

        currentSession = 0;
    }

    public void start() {
        System.out.println("\n--- POMODORO TIMER STARTED ---");
        while (currentSession < sessions.length) {
            TimerSession session = sessions[currentSession];
            session.displaySession();
            countdown(session.getDuration());
            session.completeSession();
            System.out.println("Session '" + session.getType() + "' complete.\n");
            currentSession++;
        }
        System.out.println("All sessions complete. You may now rest.");
    }

    protected void countdown(int minutes) {
        int totalSeconds = minutes * 60;

        for (int remaining = totalSeconds; remaining >= 0; remaining--) {
            int min = remaining / 60;
            int sec = remaining % 60;
            System.out.printf("\rTime Left: %02d:%02d", min, sec);
            try {
                Thread.sleep(1000); // wait for one second
            } catch (InterruptedException e) {
                System.out.println("\nTimer interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(); // new line after countdown ends
    }
}

// basic structure of a pomodoro timer
// TimerSession.java
public class TimerSession {
    private String type;       // "Work" or "Break"
    private int duration;      // in minutes
    private boolean completed;

    public TimerSession(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.completed = false;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeSession() {
        completed = true;
    }

    public void displaySession() {
        System.out.println("\nStarting " + type + " session for " + duration + " minute(s)...");
    }
}

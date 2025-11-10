/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// logic ng countdown (pomodoro)
class PomodoroTimer {
    // time settings - encoded in seconds for easy reading
    private static final int shortFocus = 25 * 60; // 25 - minutes focus
    private static final int longFocus = 30 * 60;  // 30 - minutes focus
    private static final int shortBreak = 5 * 60; // 5 - minutes focus
    private static final int longBreak = 15 * 60; // 15 - minutes focus


    // variables 
    private int remainingTime; // countdown in seconds
    private boolean running; // determines if timer is active
    private String mode; // depende sa options (longFoc, shortFoc, longBr, shortBr)

    // cons
    public PomodoroTimer(String mode) { // initial (unang mode) and its duration
        setMode(mode);
        this.running = false;
    }

    public PomodoroTimer(int i) {
      
    }

    // timer modes - it resets depending on the mode chosen
    public final void setMode(String mode) {
        this.mode = mode;
        switch (mode) { // switch case nakashortcut -> means case "kung" -> gawin mo();
            case "short focus" -> remainingTime = shortFocus;
            case "long focus" -> remainingTime = longFocus;
            case "short break" -> remainingTime = shortBreak;
            case "long break" -> remainingTime = longBreak;

            // default of pomodoro
            default -> remainingTime = shortFocus;
        
        }
    }

    // start timer - running = true (active yung timer)
    public void start() {
        running = true;
    }

    // pause timer - self explanatory haha
    public void pause() {
        running = false;
    }

    // reset timer - pag iniba yung mode, mag rereset yung timer
    public void reset() {
        setMode(mode);
        running = false;
    }

    // tick - timer will tick after each second
    public void tick() {
        if (running && remainingTime > 0) {
            remainingTime--; // nagbabawas ng time :)
        }
    }

    // getter / accessors (tagakuha ba ng info)
    public int getRemainingTime() {
        return remainingTime;
    }

    public boolean isRunning() {
        return running;
    }

    public String getMode() {
        return mode;
    }

    // format of the pomodoro timer (mm:ss)
    public String formatTime() {
        int min = remainingTime / 60; // divide by 60 para malaman ilan mins
        int sec = remainingTime % 60; // remainder for seconds
        return String.format("%02d:%02d", min, sec);
    }
}

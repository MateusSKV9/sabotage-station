package mainGame;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    private Timer timer;
    private int count;

    public GameTimer(int seconds) {
        this.count = seconds;
        this.timer = new Timer();
    }

    public void iniciar() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // task, delay e periodo
    }
}

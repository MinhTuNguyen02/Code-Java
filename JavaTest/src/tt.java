
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;





public class tt {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Task executed!");
            }
        };
        TimerTask task2 = new TimerTask() {
            public void run() {
                System.out.println("hello");
            }
        };

        timer.schedule(task, 5000);
        
//        timer.cancel();
        timer = new Timer();
        timer.schedule(task2, 5000);
    }
}

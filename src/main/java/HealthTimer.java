import java.util.TimerTask;

public class HealthTimer extends TimerTask {


    @Override
    public void run() {

        // Run the health depleting methods here


        // Run a timer test
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // print the message after the designated delay (set above in the constructor method)
        }

    }

}

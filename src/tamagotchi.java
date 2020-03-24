import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class tamagotchi {

    static class WakeUpTama extends TimerTask {
        public void run() {
            System.out.println("Your tamagotchi is awake! Yay!");
        }
    }

    public static void starterStats (){
        // starts at 1/10 health
        // age: 0
    }

//    TODO: Make it die
    public static void death (){
        // if health = 0, death
        // if health > =. life
        // if age = 27, death
    }

    public static void feedSnack (){
        // snack gives +1 health
    }

    public static void feedMeal (){
        // meal gives +5 health
    }

    public static void healthMeter (){
        // 0 - 10
    }

    static class DepleteHealth extends TimerTask {
        public void run() {
            System.out.println("-1 Health");
        }
    }




    public static void main (String [] args){
        Scanner listen = new Scanner(System.in);
//        if user says "wakeup", call setTimer and then starterStats
//        if user says "feed snack", +1 health
//        if user says "feed meal", +5 health
//        if health
        Timer timer = new Timer();
        timer.schedule(new WakeUpTama(), 5000);
        timer.schedule(new DepleteHealth(), 5000, 5000);
    }
}

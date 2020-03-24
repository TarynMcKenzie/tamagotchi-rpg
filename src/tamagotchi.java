import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class tamagotchi {

    public int healthPoints;

    public int getHealthPoints(){
        return healthPoints;
    }

    public int setHealthPoints(int changeValue){
        return healthPoints + changeValue;
    }

    static class WakeUpTama extends TimerTask {
        public void run() {

            System.out.println("Your tamagotchi is awake! Yay!");

        }
    }

    class DepleteHealth extends TimerTask {
        public void run() {

            System.out.println("-1 Health");

            setHealthPoints(-1);

        }
    }

    public static void starterStats() {
        // starts at 1/10 health
        // age: 0
    }

    public static void death() {
        // switch statement:
        // if health = 0, death
        // if health > =. life
        // if age = 27, death
    }

    public int feedSnack(int hp) {
        // snack gives +1 health
        return setHealthPoints(+1);
    }

    public int feedMeal(int hp) {
        // meal gives +5 health
        return setHealthPoints(+5);
    }

    public void healthMeter() {
        // 0 - 10
        // [**********] = 10 hp
        // [*********-] = 9 hp
        // [********--] = 8 hp
        // [*******---] = 7 hp
        // [******----] = 6 hp
        // [*****-----] = 5 hp
        // [****------] = 4 hp
        // [***-------] = 3 hp
        // [**--------] = 2 hp
        // [*---------] = 1 hp
        // [-----DEAD!-----] = 0 hp


        switch (getHealthPoints()) { //based on the numerical grade value --> do the corresponding task
            case 10:
                System.out.println("[**********]");
                break;
            case 9:
                System.out.println("[*********-]");
                break;
            case 8:
                System.out.println("[********--]");
                break;
            case 7:
                System.out.println("[*******---]");
                break;
            case 6:
                System.out.println("[******----]");
                break;
            case 5:
                System.out.println("[*****-----]");
                break;
            case 4:
                System.out.println("[****------]");
                break;
            case 3:
                System.out.println("[***-------]");
                break;
            case 2:
                System.out.println("[**--------]");
                break;
            case 1:
                System.out.println("[*---------]");
                break;
            default:
                System.out.println("[-----DEAD!-----]");
                break;

        }


    }


    public static void main(String[] args) {

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

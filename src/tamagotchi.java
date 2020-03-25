import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class tamagotchi {

    public static int healthPoints = 6;
    public static Timer timer = new Timer();
    public static Scanner listen = new Scanner(System.in);

    public static int getHealthPoints() {
        return healthPoints;
    }

    public static void setHealthPoints(int changeValue) {
        healthPoints += changeValue;
    }

    static class WakeUpTama extends TimerTask {
        public WakeUpTama() {};
        public void run() {
            System.out.println("Your tamagotchi has hatched! Yay! \nAs soon as tamagotchi hatches it will need immediate attention. \nThis is where your health meter comes in handy! \nYour health points (hp) will deteriorate every second until DEATH. \nTamagotchi will need to be fed. To feed: type 'feed snack' or 'feed meal' to +hp \nor 'no' to let your tamagotchi die.");
        }
    }

    static class DepleteHealth extends TimerTask {

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
                    System.out.println("[**********] = 10 hp");
                    break;
                case 9:
                    System.out.println("[*********-] = 9 hp");
                    break;
                case 8:
                    System.out.println("[********--] = 8 hp");
                    break;
                case 7:
                    System.out.println("[*******---] = 7 hp");
                    break;
                case 6:
                    System.out.println("[******----] = 6 hp");
                    break;
                case 5:
                    System.out.println("[*****-----] = 5 hp");
                    break;
                case 4:
                    System.out.println("[****------] = 4 hp");
                    break;
                case 3:
                    System.out.println("[***-------] = 3 hp");
                    break;
                case 2:
                    System.out.println("[**--------] = 2 hp");
                    break;
                case 1:
                    System.out.println("[*---------] = 1 hp");
                    break;
                default:
                    System.out.println("[-----DEAD!-----]");
                    break;
            }
        }

//        public void feedSnack(int hp) {
//            // snack gives +1 health
//            String userInput = listen.nextLine();
//            if (userInput.equalsIgnoreCase("feed snack")) {
//                setHealthPoints(+1);
//                healthMeter();
//            }
//
//        }

        public void run() {
            setHealthPoints(-1);
            healthMeter();

            String userInput = listen.nextLine();
            if (userInput.equalsIgnoreCase("feed snack")) {
                setHealthPoints(+1);
                healthMeter();
            }

            if (getHealthPoints() == 0) {
                healthMeter();
                System.out.println("Your tamagotchi is DEAD");
                timer.cancel();
            }
            if (getHealthPoints() == 4){
                healthMeter();

            }
        }
    }


    public static void death() {
        if (getHealthPoints() == 0) {
            System.out.println("He dead");
        }
        // switch statement:
        // if health = 0, death
        // if health > =. life
    }


    public void feedMeal(int hp) {
        // meal gives +5 health
        setHealthPoints(+5);
    }


    public static void main(String[] args) {


//        if user says "wakeup", call setTimer and then starterStats
//        if user says "feed snack", +1 health
//        if user says "feed meal", +5 health
//        if health


        tamagotchi.WakeUpTama wakeup = new tamagotchi.WakeUpTama();
        timer.schedule(wakeup, 5000);

        tamagotchi.DepleteHealth deplete = new tamagotchi.DepleteHealth();
        timer.schedule(deplete, 5000, 5000);
    }
}

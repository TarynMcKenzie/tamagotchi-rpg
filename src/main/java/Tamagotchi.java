import java.util.Timer;
import java.util.TimerTask;

public class Tamagotchi extends Thread {

    // class that creates the tamagotchi objects while implementing the TamagotchiHabits interface

    // =============== INITIALIZATION ===============
    protected String userDefinedName;

    // ------------- Non-changeable Stats -------------
    int age; // days from egg --> present state
    String gender; // male or female

    Timer timer;

    // =============== CONSTRUCTOR METHOD ===============
    public Tamagotchi(String tamagotchiName) {

        // How the tamagotchi will be constructed
        this.userDefinedName = tamagotchiName;

        timer = new Timer(); //when a new tamagotchi is created, set instantiate a new Timer
        timer.schedule(new newTamagotchiHatch(), 0);
//                5000,        //initial delay
//                1*5000);  //subsequent rate

    }

    class newTamagotchiHatch extends TimerTask {

        public void run() { // begin the TimerTask
            for (int i = 0; i < 10; i++) {
//                Thread.sleep(1000);
                System.out.println(i); // print the message after the designated delay (set above in the constructor method)
                timer.cancel(); //Terminate the timer thread
            }

        }

    }


    // =============== METHOD IMPLEMENTATION ===============
    // ------------- Non-changeable Stats -------------

    public int getAge() {
        // Goal: days from egg --> present state

        // Will the tama age according to our own age progressions? Faster? Slower?
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        // Goal:  male or female

        // How will the gender be determined?
        // Can the user choose the gender?
        this.gender = gender;

    }

    // ------------- Multithreading Methods -------------
    public void run() {
        System.out.println("thread one is running...");
    }

}

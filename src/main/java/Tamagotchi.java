import java.util.Random;
import java.util.Timer;

public class Tamagotchi extends Thread {

    // class that creates the tamagotchi objects while implementing the TamagotchiHabits interface

    // =============== INITIALIZATION ===============
    protected String userDefinedName;
    public static double healthPoints = 4;

    // ------------- Non-changeable Stats -------------
    int age = 0; // days from egg --> present state
    String gender; // male or female


    // =============== CONSTRUCTOR METHOD ===============
    public Tamagotchi(String tamagotchiName) {

        // How the tamagotchi will be constructed
        this.userDefinedName = tamagotchiName;

        setGender();

        HealthTimer beginTimer = new HealthTimer();
        beginTimer.run();
    }


    // =============== METHOD IMPLEMENTATION ===============

    public static double getHealthPoints() {
        System.out.println(healthPoints);
        return healthPoints;
    }

    public static void setHealthPoints(double changeValue) {
        healthPoints += changeValue;
    }

    public String getUserDefinedName() {
        return userDefinedName;
    }

    public void setUserDefinedName(String userDefinedName) {
        this.userDefinedName = userDefinedName;
    }

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

    public void setGender() {
        // Goal:  male or female

        // How will the gender be determined? via Random()
        // Can the user choose the gender? no

        if(new Random().nextBoolean()) {
            this.gender = "male";
        } else {
            this.gender = "female";
        }

    }

    // ------------- Multithreading Methods -------------
    public void run() {
        System.out.print("\nthread two is running...\n");

        Timer timer = new Timer(); //when a new tamagotchi is created, set instantiate a new Timer
        timer.schedule(new HealthTimer(), 5000, 5000); // Timer is schedule to run at a 5 (5000 millisecond) second interval

        // Note: In the case of printing numbers to System.out, all of the threads are trying to contest for access to the same resource System.out which is a synchronized PrintStream.
        // This means that most of the time is wasted waiting for another thread to release the lock on System.out.
    }

}

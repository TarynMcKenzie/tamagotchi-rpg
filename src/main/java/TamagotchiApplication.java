// Goal: use multithreading to get the user and tamagotchi methods running independently whilst allowing the user to have an affect on the tamagotchi happiness and hunger points.

import java.util.Scanner;

public class TamagotchiApplication extends Thread{

    Scanner userAction = new Scanner(System.in);

    public void run(){
        System.out.println("thread is running...");
    }


    public static void main(String[] args) {

        // Run the methods necessary

        //---------- THREAD ONE ------------
        Tamagotchi usersTamagotchi = new Tamagotchi("Harold");
        usersTamagotchi.start();

        //---------- THREAD TWO ------------
        User tamagotchiPlayer = new User("Steve");
        tamagotchiPlayer.start();
    }

}

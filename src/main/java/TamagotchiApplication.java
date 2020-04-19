// Goal: use multithreading to get the user and tamagotchi methods running independently whilst allowing the user to have an affect on the tamagotchi happiness and hunger points.

import java.util.Scanner;
import java.util.Timer;

public class TamagotchiApplication {

    public static void main(String[] args) {
        // Run the methods necessary

        Scanner input = new Scanner(System.in);


        System.out.println(" _                                    _       _     _ \n" +
                "| |                                  | |     | |   (_)\n" +
                "| |_ __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ \n" +
                "| __/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |\n" +
                "| || (_| | | | | | | (_| | (_| | (_) | || (__| | | | |\n" +
                " \\__\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|\n" +
                "                           __/ |                      \n" +
                "                          |___/                       \n");


        System.out.print("What is your player name?");
        String playerName = input.nextLine();

        //---------- THREAD ONE ------------
        User tamagotchiPlayer = new User(playerName);
        tamagotchiPlayer.setUser(playerName);

        System.out.println("Welcome," + Tamagotchi.getUserDefinedName() + " here is your tamagotchi egg.");

        System.out.println("You are going to have a " + Tamagotchi.getGender() + " tamagotchi");
        System.out.println("Your new tamagotchi will hatch soon. Be patient.");

        tamagotchiPlayer.start();// Start new thread, which is defined by the run() in the User Class



        //---------- THREAD TWO ------------
        System.out.print("While you wait for it to hatch, give your Tamagotchi a name:");
        String tamagotchiName = input.nextLine();

        Tamagotchi usersTamagotchi = new Tamagotchi(tamagotchiName);
        usersTamagotchi.setUserDefinedName(tamagotchiName);

        usersTamagotchi.start(); // Start new thread, which is defined by the run() in the Tamagotchi Class

    }

}

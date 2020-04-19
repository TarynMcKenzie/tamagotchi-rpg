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


        System.out.print("What is your player name? ");
        String playerName = input.nextLine();

        //---------- THREAD ONE ------------
        User tamagotchiPlayer = new User(playerName);
        tamagotchiPlayer.setUser(playerName);

        System.out.println("\nWelcome, " + tamagotchiPlayer.getUser() + ". Here is your tamagotchi egg!\n\n" +
                "Get ready for your baby Tamagotchi to hatch. \n" +
                "When it does hatch, it will be hungry and won't be too happy so it will need some taking care of. \n\n"
        );

        tamagotchiPlayer.start();// Start new thread, which is defined by the run() in the User Class


        //---------- THREAD TWO ------------
        System.out.print("Give your Tamagotchi a name: ");
        String tamagotchiName = input.nextLine();

        Tamagotchi usersTamagotchi = new Tamagotchi(tamagotchiName);
        usersTamagotchi.setUserDefinedName(tamagotchiName);

        System.out.println("Suprise! " + usersTamagotchi.getUserDefinedName() + " is going to be a " + usersTamagotchi.getGender() + " tamagotchi. " + usersTamagotchi.getUserDefinedName() + " will hatch soon. Be patient.");

        usersTamagotchi.start(); // Start new thread, which is defined by the run() in the Tamagotchi Class

    }

}

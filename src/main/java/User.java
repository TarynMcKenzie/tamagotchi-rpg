import java.util.Scanner;

public class User extends Thread {

    //Class creates object for a user account. This is for tracking the user discipline level.

    // =============== INITIALIZATION ===============
    protected String user;


    // =============== CONSTRUCTOR METHOD ===============
    public User(String userName) {

        this.user = userName;

    }


    // =============== METHODS ===============
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    // ------------- Multithreading Methods -------------
    public void run() {

        Scanner input = new Scanner(System.in);

        System.out.print("\nThread one is running...\n");

        String userInput = input.nextLine();


        // Note: In the case of printing numbers to System.out, all of the threads are trying to contest for access to the same resource System.out which is a synchronized PrintStream.
        // This means that most of the time is wasted waiting for another thread to release the lock on System.out.
    }

}

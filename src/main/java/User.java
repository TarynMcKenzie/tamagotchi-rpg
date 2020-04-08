import java.util.Scanner;

public class User extends Thread {

    //Class creates object for a user account. This is for tracking the user discipline level.

    // =============== INITIALIZATION ===============
    protected String user;


    // =============== CONSTRUCTOR METHOD ===============
   public User(String userName){

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
    public void run(){
        System.out.println("thread two is running...");
    }

}

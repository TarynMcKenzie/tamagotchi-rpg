// Goal: use multithreading to get the user and tamagotchi methods running independently whilst allowing the user to have an affect on the tamagotchi happiness and hunger points.

public class TamagotchiApplication extends Thread{


    public void run(){
        System.out.println("thread is running...");
    }


    public static void main(String[] args) {

        // Run the methods necessary

        Tamagotchi usersTamagotchi=new Tamagotchi("Harold");
        usersTamagotchi.start();
    }

}

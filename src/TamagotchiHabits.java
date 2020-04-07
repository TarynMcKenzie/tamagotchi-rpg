public interface TamagotchiHabits {


    /*
     When a tamagotchi is created they will have an incubation period (egg status)
     Following the incubation period the egg will hatch. Out pops your brand new tamagotchi character chosen at random.
     Your tamagotchi will need to be played with, fed, use the bathroom, put to sleep.
     If taken care of well, the tamagotchi will evolve to the next level (3 levels: infant, teen, adult)
     */

    void incubation();

    void bored();
    void eat();
    void poop();
    void sleep();

    void evolve();

    void die();

}

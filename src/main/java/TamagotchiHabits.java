public interface TamagotchiHabits {


    /*
     When a tamagotchi is created they will have an incubation period (egg status)
     Following the incubation period the egg will hatch. Out pops your brand new tamagotchi character chosen at random.
     Your tamagotchi will need to be played with, fed, use the bathroom, put to sleep.
     If taken care of well, the tamagotchi will evolve to the next level (5 levels: egg, baby, child, teen, adult)
     */


    // ------------- Level Progression -------------
    void incubation(); // egg --> child
    void evolve(); // baby --> child --> adult
    void die(); // baby --> die  or  child --> die  or  adult --> die

    // ------------- Non-changeable Stats -------------
    void age(); // days from egg --> present state
    void gender(); // male or female

    // ------------- Health Meters -------------
    void happy(); // heart health points (max = 4 hearts)
    void hungry(); // hunger health points (max = 4 hearts)

    // ------------- User Affected Stats -------------
    void bored(); // (after x hours) if played with --> +2 , else --> -2
    void eat(); // (after x hours) if fed --> +2 , else --> -2  ** snack +1 or -1 **
    void poop(); // (after x hours --> poop) , (after x hours) if not cleaned up by user -2, else +2
    void sleep(); // (after x hours) if put to sleep +3, else -3
}

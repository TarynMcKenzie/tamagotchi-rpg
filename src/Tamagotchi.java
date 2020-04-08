public class Tamagotchi implements TamagotchiHabits{

    // class that creates the tamagotchi objects while implementing the TamagotchiHabits interface

    // =============== INITIALIZATION ===============
    protected String userDefinedName;



    // =============== CONSTRUCTOR METHOD ===============
    public Tamagotchi(String tamagotchiName){

        // How the tamagotchi will be constructed
        this.userDefinedName = tamagotchiName;

    }


    // =============== METHOD IMPLEMENTATION ===============

    // ------------- Level Progression -------------
    @Override
    public void incubation() {
        // Goal: egg --> child

        // Will the user name their character at this point? Or after it hatches?
        // When will the egg hatch?
        // Will the user be required to care for the egg? Or just wait?
        // What will happen when the egg hatches?
    }

    @Override
    public void evolve() {
        // Goal: child --> adult

        // How many levels are there?
        // When will the tama achieve the next level? How?
        // Will they die of old age?
        // If so, what is the maximum age?

    }

    @Override
    public void die(){
        // Goal: child --> die or adult --> die

        // When the tama dies, what will be displayed to the user?
    }




    // ------------- Non-changeable Stats -------------
    @Override
    public void age(){
        // Goal: days from egg --> present state

        // Will the tama age according to our own age progressions? Faster? Slower?
    }

    @Override
    public void gender(){
        // Goal: // male or female

        // How will the gender be determined?
        // Can the user choose the gender?
    }



    // ------------- Health Meters -------------
    @Override
    public void happy(){
        //Goal: heart health points (max = 4 hearts)

        // What will determines the tama happiness?
        // How fast will their happiness deplete?
    }

    @Override
    public void hungry(){
        //Goal: hunger health points (max = 4 hearts)

        // What will determine the tama hunger?
        // How fast will their hunger deplete?
    }



    // ------------- User Affected Stats -------------
    @Override
    public void bored() {
        //Goal: (after x hours) if played with --> +2 , else --> -2

        // How long will it take for the tama to get bored?
    }

    @Override
    public void eat() {
        //Goal: (after x hours) if fed --> +2 , else --> -2  ** snack +1 or -1 **

        // How much health points will it receive for snacks?
        // What snacks are available?
        // How much health points will it receive for meals?
        // What meals are available?
    }

    @Override
    public void poop() {
        //Goal: (after x hours --> poop) , (after x hours) if not cleaned up by user -2, else +2

        // Will it got both number 1 and 2?
        // How often will it go?
        // At what point will it become a health risk?
    }

    @Override
    public void sleep() {
        // Goal: (after x hours) if put to sleep +3, else -3

        // How much sleep does it require?
        // How much awake time before it gets tired?
        // At what point is sleep deprivation a health hazard?
    }

}

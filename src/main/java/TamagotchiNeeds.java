public abstract class TamagotchiNeeds implements TamagotchiHabits {


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

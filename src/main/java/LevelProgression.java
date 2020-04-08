public abstract class LevelProgression extends Tamagotchi implements TamagotchiHabits{

    // =============== CONSTRUCTOR METHOD ===============
    public LevelProgression(String tamagotchiName) {
        super(tamagotchiName);
    }


    // =============== METHOD IMPLEMENTATION ===============
    // ------------- Level Progression -------------
    @Override
    public void incubation() {
        // Goal: egg --> baby

        // Will the user name their character at this point? Or after it hatches?
        // When will the egg hatch?
        // Will the user be required to care for the egg? Or just wait?
        // What will happen when the egg hatches?
    }

    @Override
    public void evolve() {
        // Goal: baby --> child --> adult

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

}

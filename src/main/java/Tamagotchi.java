public class Tamagotchi extends Thread {

    // class that creates the tamagotchi objects while implementing the TamagotchiHabits interface

    // =============== INITIALIZATION ===============
    protected String userDefinedName;

    // ------------- Non-changeable Stats -------------
    int age; // days from egg --> present state
    String gender; // male or female


    // =============== CONSTRUCTOR METHOD ===============
    public Tamagotchi(String tamagotchiName){

        // How the tamagotchi will be constructed
        this.userDefinedName = tamagotchiName;

    }


    // =============== METHOD IMPLEMENTATION ===============
    // ------------- Non-changeable Stats -------------

    public int getAge() {
        // Goal: days from egg --> present state

        // Will the tama age according to our own age progressions? Faster? Slower?
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        // Goal:  male or female

        // How will the gender be determined?
        // Can the user choose the gender?
        this.gender = gender;

    }

    // ------------- Multithreading Methods -------------
    public void run(){
        System.out.println("thread one is running...");
    }

}

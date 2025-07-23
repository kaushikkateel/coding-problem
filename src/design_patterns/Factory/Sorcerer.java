package design_patterns.Factory;

public class Sorcerer implements PlayerClass{

    private String startingWeapon;

    public Sorcerer() {

        this.startingWeapon="Sorcerer's Staff";
    }
    @Override
    public String getStartingWeapon() {
        return startingWeapon;
    }
}

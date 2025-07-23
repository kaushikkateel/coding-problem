package design_patterns.Factory;

public class Warrior implements PlayerClass{

    private String startingWeapon;

    public Warrior() {

        this.startingWeapon="Battle Axe";
    }
    @Override
    public String getStartingWeapon() {
        return startingWeapon;
    }
}

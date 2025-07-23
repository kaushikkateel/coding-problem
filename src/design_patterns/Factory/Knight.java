package design_patterns.Factory;

public class Knight implements PlayerClass{

    private String startingWeapon;

    public Knight() {
        this.startingWeapon="Longsword";

    }
    @Override
    public String getStartingWeapon() {
        return startingWeapon;
    }
}

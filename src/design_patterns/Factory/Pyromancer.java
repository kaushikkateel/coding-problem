package design_patterns.Factory;

public class Pyromancer implements PlayerClass{

    private String startingWeapon;

    public Pyromancer() {

        this.startingWeapon="Fire Ball";
    }

    @Override
    public String getStartingWeapon() {
        return startingWeapon;
    }
}

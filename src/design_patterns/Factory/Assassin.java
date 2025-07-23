package design_patterns.Factory;

public class Assassin implements PlayerClass{

    private String startingWeapon;

    public Assassin() {

        this.startingWeapon="Estoc";
    }
    @Override
    public String getStartingWeapon() {
        return startingWeapon;
    }
}

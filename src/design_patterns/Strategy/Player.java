package design_patterns.Strategy;

public class Player {

    private Weapon weaponInHand;

    public void setWeaponInHand(Weapon weapon ){
        this.weaponInHand = weapon;
    }

    public void attack(Enemy enemy){
        weaponInHand.attack(enemy);
    }
}

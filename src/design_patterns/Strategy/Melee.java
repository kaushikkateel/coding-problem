package design_patterns.Strategy;

public class Melee implements  Weapon{

    private final int damage = 10;

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Attacked with Melee, Enemy health " + enemy.getHp());
    }
}

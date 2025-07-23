package design_patterns.Strategy;

public class Vandal implements  Weapon{

    private final int damage = 50;

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Attacked with Vandal, Enemy health " + enemy.getHp());
    }
}

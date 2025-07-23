package design_patterns.Strategy;

public class Phantom implements  Weapon{

    private final int damage = 40;

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Attacked with Phantom, Enemy health " + enemy.getHp());
    }
}

package design_patterns.Strategy;

public class Operator implements  Weapon{

    private final int damage = 100;

    @Override
    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Attacked with Operator, Enemy health " + enemy.getHp());
    }
}

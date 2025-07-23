package design_patterns.Builder;

import design_patterns.Strategy.Enemy;

public class Game {
    public static void main(String[] args) {
        Enemy enemy = new Enemy.EnemyBuilder()
                .armor()
                .helmet()
                .build();

        System.out.println(enemy.getHp());
    }

}

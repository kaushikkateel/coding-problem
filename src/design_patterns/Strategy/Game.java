package design_patterns.Strategy;

public class Game {

    public static void main(String[] args) {
        Enemy enemy = new Enemy.EnemyBuilder()
                .armor()
                .helmet()
                .build();

        Player player=new Player();
        player.setWeaponInHand(new Melee());
        player.attack(enemy);
        player.setWeaponInHand(new Vandal());
        player.attack(enemy);
        player.setWeaponInHand(new Phantom());
        player.attack(enemy);
        player.setWeaponInHand(new Operator());
        player.attack(enemy);


    }

}

package design_patterns.Strategy;

public class Enemy {
    private int hp;

    public Enemy(EnemyBuilder enemyBuilder){
        this.hp = enemyBuilder.basicHp + enemyBuilder.armor + enemyBuilder.helmet;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static class EnemyBuilder {
        private int basicHp ;
        private int armor;
        private int helmet;

        public EnemyBuilder(){
            this.basicHp=100;
        }

        public EnemyBuilder armor() {
            this.armor = 75;
            return this;
        }


        public EnemyBuilder helmet() {
            this.helmet = 25;
            return this;
        }

        public Enemy build() {
            return new Enemy(this);
        }
    }
}

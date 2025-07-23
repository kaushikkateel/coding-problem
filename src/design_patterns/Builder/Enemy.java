package design_patterns.Builder;

public class Enemy {
    private int hp;

    public Enemy(design_patterns.Builder.Enemy.EnemyBuilder enemyBuilder){
        this.hp = enemyBuilder.basicHp + enemyBuilder.armor + enemyBuilder.helmet;
    }

    public int getHp() {
        return hp;
    }

    public static class EnemyBuilder {
        private int basicHp ;
        private int armor;
        private int helmet;

        public EnemyBuilder(){
            this.basicHp=100;
        }

        public design_patterns.Builder.Enemy.EnemyBuilder armor() {
            this.armor = 75;
            return this;
        }


        public design_patterns.Builder.Enemy.EnemyBuilder helmet() {
            this.helmet = 25;
            return this;
        }

        public design_patterns.Builder.Enemy build() {
            return new design_patterns.Builder.Enemy(this);
        }
    }
}

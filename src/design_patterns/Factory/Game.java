package design_patterns.Factory;

public class Game {
    public static void main(String[] args)  {
        PlayerClass playerClass = PlayerClassFactory.choosePlayerCLass("knight");
        System.out.print("Your starting weapon is: ");
        System.out.println(playerClass.getStartingWeapon());
         playerClass = PlayerClassFactory.choosePlayerCLass("warrior");
        System.out.print("Your starting weapon is: ");
        System.out.println(playerClass.getStartingWeapon());
         playerClass = PlayerClassFactory.choosePlayerCLass("assassin");
        System.out.print("Your starting weapon is: ");
        System.out.println(playerClass.getStartingWeapon());
         playerClass = PlayerClassFactory.choosePlayerCLass("sorcerer");
        System.out.print("Your starting weapon is: ");
        System.out.println(playerClass.getStartingWeapon());
         playerClass = PlayerClassFactory.choosePlayerCLass("pyromancer");
        System.out.print("Your starting weapon is: ");
        System.out.println(playerClass.getStartingWeapon());

    }
}

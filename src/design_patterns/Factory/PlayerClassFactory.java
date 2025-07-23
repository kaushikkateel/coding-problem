package design_patterns.Factory;

public class PlayerClassFactory {

public static PlayerClass choosePlayerCLass(String pClass){

   return switch (pClass.toLowerCase()){
       case "knight" -> new Knight();
       case "warrior" -> new Warrior();
       case "assassin" -> new Assassin();
       case "sorcerer" -> new Sorcerer();
       case "pyromancer" -> new Pyromancer();
       default -> throw new IllegalStateException("Unexpected value: " + pClass);
   };
}
}

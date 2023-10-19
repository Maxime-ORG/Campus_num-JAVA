package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Characters myCharacters;
        Stage myStage = new Stage(64);
        Menu myMenu = new Menu();
        myMenu.menuMain(myStage);

        // System.out.println(getRandomBetween(1,6));
        // System.out.println(new Main.Guerriers("popol").toString());
        // System.out.println(new Main.EquipementOffensif.Sort("").toString());
        // System.out.println(new Main.Potion("Grande potion").toString());
        // System.out.println(new Character("ennemy", "Main.Enemy.Dragon").toString());
        // System.out.println(new Main.EquipementDefensif.Main.EquipementDefensif("Main.EquipementDefensif.Bouclier en acier").toString());
        // System.out.println(Arrays.toString(myStage.getCells()));
        // transport(34,9);
    }
    public static int getRandomBetween(int min, int max){
        Random ran = new Random();
        int myRandom = ran.nextInt(max - min + 1) + min;
        return myRandom;
    }
}


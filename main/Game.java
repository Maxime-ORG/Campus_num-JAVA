package main;

import main.characters.Characters;
import main.characters.Dragon;
import main.characters.Gobelin;
import main.characters.Sorcier;
import main.stage.Cell;
import main.stage.MysteryBox;
import main.stage.Stage;

import java.util.Random;

public class Game {
    private Stage myStage;
    private Characters characters;

    public Game(Characters pCharacter){
        characters = pCharacter;
        characters.setPosition(0);
    }

    public void PlaySmallStage() {
        setSmallStage();
        while (characters.getPosition() < myStage.getCells().length && characters.getCurrentLife() > 0) {
            System.out.println("Case : "+characters.getPosition());
            if (myStage.getCell(characters.getPosition()).getEnemy() != null) {
                fight(myStage.getCell(characters.getPosition()).getEnemy(), characters);
            } else if (myStage.getCell(characters.getPosition()).getMysteryBox() != null) {
                useMysteryBox(characters, myStage.getCell(characters.getPosition()).getMysteryBox());
            }

            characters.setPosition(characters.getPosition() + 1);
        }
        if (characters.getCurrentLife() > 0){
            System.out.println("gg");
        } else {
            System.out.println("YOU LOSE");
        }
    }

    public void PlayBigStage() {
        setBigstage();
        while (characters.getPosition() < myStage.getCells().length && characters.getCurrentLife() > 0) {
            System.out.println("Case : "+characters.getPosition());
            if (myStage.getCell(characters.getPosition()).getEnemy() != null) {
                fight(myStage.getCell(characters.getPosition()).getEnemy(), characters);
            } else if (myStage.getCell(characters.getPosition()).getMysteryBox() != null) {
                useMysteryBox(characters, myStage.getCell(characters.getPosition()).getMysteryBox());
            }

            characters.setPosition(characters.getPosition() + getRandomBetween(1,6));
        }
        if (characters.getCurrentLife() > 0){
            System.out.println("gg");
        } else {
            System.out.println("YOU LOSE");
        }
    }

    private void useMysteryBox(Characters myCharacter, MysteryBox myMysteryBox){
        myMysteryBox.getMysteryEquipement().interact(characters);
    }

    private void fight(Characters enemy, Characters myCharacter){
        enemy.setCurrentLife(enemy.getCurrentLife()-(myCharacter.getAttack()+ myCharacter.getOffensiveItem().getAttack()));
        System.out.println(myCharacter.getName()+" attaque : "+enemy.getName()+" pour un montant de "+(myCharacter.getAttack()+ myCharacter.getOffensiveItem().getAttack())+" hp");
        if (enemy.getCurrentLife()>0){
            myCharacter.setCurrentLife(myCharacter.getCurrentLife()-enemy.getAttack());
            System.out.println(enemy.getName()+" attaque : "+myCharacter.getName()+" pour un montant de "+enemy.getAttack()+" hp");
        }
        System.out.println("Hero : "+myCharacter);
        System.out.println("Enemy : "+enemy);
    }

    

    private void setSmallStage(){
        myStage = new Stage(10);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),1);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Gablurb !!!!")),2);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Gablurb !!!!")),3);
        //myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),2);
        //myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(8)),3);
    }

    private void setBigstage(){
        myStage = new Stage(64);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Smaug")),45);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Smaug")),52);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Smaug")),56);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Smaug")),62);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),10);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),20);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),25);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),32);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),35);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),36);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),37);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),40);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),44);
        myStage.setCell(new Cell().setandGetEnemy(new Sorcier("Sarouman")),47);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),3);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),6);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),9);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),12);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),15);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),18);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),21);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),24);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),27);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Chef Gobelin")),30);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),2);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),11);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),5);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),22);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),38);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),19);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),26);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),42);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),53);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(5)),1);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(5)),4);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(5)),8);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(5)),17);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(5)),23);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(0)),48);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(0)),49);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(9)),7);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(9)),13);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(9)),31);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(9)),33);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(9)),39);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(9)),43);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(8)),28);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(8)),41);
    }
    public static int getRandomBetween(int min, int max){
        Random ran = new Random();
        int myRandom = ran.nextInt(max - min + 1) + min;
        return myRandom;
    }

    @Override
    public String toString() {
        return "Game{" +
                "myStage=" + myStage +
                ", characters=" + characters +
                '}';
    }
}

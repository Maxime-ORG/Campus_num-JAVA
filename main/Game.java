package main;

import main.characters.Characters;
import main.characters.Gobelin;
import main.equipement.*;
import main.equipement.EquipementOffensif.Epee;
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
        setSmallStage();
    }

    public void Play() {
        while (characters.getPosition() < myStage.getCells().length) {
            System.out.println("Case : "+characters.getPosition());
            if (myStage.getCell(characters.getPosition()).getEnemy() != null) {
                fight(myStage.getCell(characters.getPosition()).getEnemy(), characters);
            } else if (myStage.getCell(characters.getPosition()).getMysteryBox() != null) {
                useMysteryBox(characters, myStage.getCell(characters.getPosition()).getMysteryBox());
            }

            characters.setPosition(characters.getPosition() + 1);
        }
    }

    private void useMysteryBox(Characters myCharacter, MysteryBox myMysteryBox){
        System.out.println("log :"+myMysteryBox.getMysteryEquipement().getClass());
        if(myMysteryBox.getMysteryEquipement().getClass().equals("class main.equipement.EquipementOffensif.Epee")){
            System.out.println(myMysteryBox.getMysteryEquipement().getClass());
            System.out.println("HOURA");
        }
    }

    private void fight(Characters enemy, Characters myCharacter){
        enemy.setLife(enemy.getLife()-(myCharacter.getAttack()+ myCharacter.getOffensiveItem().getAttack()));
        System.out.println(myCharacter.getName()+" attaque : "+enemy.getName()+" pour un montant de "+(myCharacter.getAttack()+ myCharacter.getOffensiveItem().getAttack())+" hp");
        if (enemy.getLife()>0){
            myCharacter.setLife(myCharacter.getLife()-enemy.getAttack());
            System.out.println(enemy.getName()+" attaque : "+myCharacter.getName()+" pour un montant de "+enemy.getAttack()+" hp");
        }
        System.out.println("Hero : "+myCharacter);
        System.out.println("Enemy : "+enemy);
    }

    private void setSmallStage(){
        myStage = new Stage(4);
        myStage.setCell(new Cell().setandGetEnemy(new Gobelin("Gablurb !!!!")),1);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),2);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(8)),3);
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

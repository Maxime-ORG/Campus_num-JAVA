package main;

import main.characters.Characters;
import main.characters.Dragon;
import main.characters.Gobelin;
import main.characters.Sorcier;
import main.equipement.Equipement;
import main.equipement.EquipementDefensif.BouclierAcier;
import main.equipement.EquipementOffensif.Arme;
import main.equipement.EquipementOffensif.BouleDeFeu;
import main.stage.Cell;
import main.stage.MysteryBox;
import main.stage.Stage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner clavier = new Scanner(System.in);
    private Stage myStage;
    private Characters characters;

    public Game(Characters pCharacter){
        characters = pCharacter;
        characters.setPosition(0);
    }


    public void play(boolean debug) {
        if(debug){
            myStage = Stage.setdebugStage();
        } else {
            myStage = Stage.setBigstage();
        }
        while (characters.getPosition() < myStage.getCells().length && characters.getCurrentLife() > 0) { // if position < taille du plateau ET life > 0
            System.out.println("Case : "+characters.getPosition());
            try{
                Cell cellTemp = myStage.getCell(characters.getPosition());
            } catch (java.lang.ArrayIndexOutOfBoundsException myAAAAwesomeException){
                System.out.println("Out of Bound error -> remise à 0 de la position");
                characters.setPosition(0);
            } finally {
                if (myStage.getCell(characters.getPosition()).getEnemy() != null) { // if ennemy
                    fight(myStage.getCell(characters.getPosition()).getEnemy(), characters);
                } else if (myStage.getCell(characters.getPosition()).getMysteryBox() != null) { // if mysterybox
                    pushMysteryItemInIventory(myStage.getCell(characters.getPosition()).getMysteryBox());
                    useMysteryBox(myStage.getCell(characters.getPosition()).getMysteryBox());
                }
                characters.setPosition(characters.getPosition() + getRandomBetween(1,6));
            }
            System.out.println("-------------------------------------------");
        }
        if (characters.getCurrentLife() > 0){
            System.out.println("gg");
        } else {
            System.out.println("YOU LOSE");
        }
    }

    private void useMysteryBox(MysteryBox myMysteryBox){
        myMysteryBox.getMysteryEquipement().interact(characters);
    }

    private void pushMysteryItemInIventory(MysteryBox myMysteryBox){
        LinkedList<Equipement> inventoryList = characters.getInventory();
        inventoryList.add(myMysteryBox.getMysteryEquipement());
        characters.setInventory(inventoryList);
    }

    private void fight(Characters enemy, Characters myCharacter){
        String playerInput;
        boolean fleeing = false;

        while(enemy.getCurrentLife()>0 && !fleeing){
            System.out.println("----------------  "+enemy.getClass().getSimpleName()+"  ----------------");
            System.out.println("atk : "+enemy.getAttack());
            System.out.println("hp  : "+enemy.getCurrentLife());
            System.out.println("1 - Attaquer");
            System.out.println("2 - Fuir");
            System.out.println("3 - Afficher vos stats");
            System.out.println("4 - Inventaire");
            System.out.println("-------------------------------------------");
            playerInput = clavier.nextLine();
            if (playerInput.equalsIgnoreCase("1") || playerInput.equalsIgnoreCase("Attaque")){
                enemy.setCurrentLife(enemy.getCurrentLife()-(myCharacter.getAttack()+ myCharacter.getOffensiveItem().getAttack()));
                System.out.println(myCharacter.getName()+" attaque "+enemy.getName()+", pour un montant de "+(myCharacter.getAttack()+ myCharacter.getOffensiveItem().getAttack())+" hp");
                if (enemy.getCurrentLife()>0){
                    myCharacter.setCurrentLife(myCharacter.getCurrentLife()-enemy.getAttack());
                    System.out.println(enemy.getName()+" attaque "+myCharacter.getName()+", pour un montant de "+enemy.getAttack()+" hp");
                }
            } else if (playerInput.equalsIgnoreCase("2") || playerInput.equalsIgnoreCase("Fuir")) {
                fleeing = true;
                characters.setPosition(characters.getPosition()-getRandomBetween(1,6));
                System.out.println(characters.getName()+" fuis en "+characters.getPosition());
            } else if (playerInput.equalsIgnoreCase("3") || playerInput.equalsIgnoreCase("Afficher") || playerInput.equalsIgnoreCase("Afficher vos stats") || playerInput.equalsIgnoreCase("stats") || playerInput.equalsIgnoreCase("stat")) {
                System.out.println(characters);
            } else if (playerInput.equalsIgnoreCase("4") || playerInput.equalsIgnoreCase("inventaire")) {
                inventory();
            } else {
                System.out.println("... tu fais exprès ?");
            }
        }
        if(enemy.getCurrentLife() <= 0){
            myStage.setCell(new Cell(), characters.getPosition());
        }

        System.out.println("Hero : "+myCharacter);
        System.out.println("Enemy : "+enemy);
    }

    private void inventory(){
        boolean exitInventory = false;
        String playerInput;
        while (!exitInventory){
            System.out.println("---------------  inventory  ---------------");
            System.out.println("1 - Afficher item");
            System.out.println("2 - Utiliser item");
            System.out.println("3 - Afficher vos stats");
            System.out.println("4 - Quitter");
            System.out.println("-------------------------------------------");
            playerInput = clavier.nextLine();
            if (playerInput.equalsIgnoreCase("1") || playerInput.equalsIgnoreCase("Afficher item")){
                displayInventory();
            } else if (playerInput.equalsIgnoreCase("2") || playerInput.equalsIgnoreCase("Utiliser item")|| playerInput.equalsIgnoreCase("Utiliser")){
                useItem();
            } else if (playerInput.equalsIgnoreCase("3") || playerInput.equalsIgnoreCase("Afficher vos stats")|| playerInput.equalsIgnoreCase("stat")){
                System.out.println(characters);
            } else if (playerInput.equalsIgnoreCase("4") || playerInput.equalsIgnoreCase("quitter")){
                exitInventory = true;
            } else {
                System.out.println("...");
            }
        }
    }
    
    private void useItem(){
        boolean exitUseItem = false;
        String playerInput = null;
        while (!exitUseItem){
            System.out.println("----------------  use item  ---------------");
            System.out.println("index de l'item à utiliser");
            System.out.println("EXIT - quitter");
            System.out.println("-------------------------------------------");
            playerInput = clavier.nextLine();
            if(playerInput.equalsIgnoreCase("EXIT")){
                exitUseItem = true;
            } else if (isInteger(playerInput)) {
                characters.getInventory().get(Integer.parseInt(playerInput)).interact(characters);
            }
        }
    }

    private void displayInventory(){
        int indexInventory = 0;
        for (Equipement element : characters.getInventory()) {
            if (element != null){
                System.out.print(indexInventory+" ");
                element.displayInvStyle();
            }
            indexInventory ++;
        }
    }

    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
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

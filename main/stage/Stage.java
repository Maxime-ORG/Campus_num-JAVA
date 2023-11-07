package main.stage;

import main.characters.Dragon;
import main.characters.Gobelin;
import main.characters.Sorcier;

import java.util.Arrays;

public class Stage {
    private Cell[] cells;
    private Stage(int size){
        constructCells(size);
    }

    public void constructCells(int size){
        this.cells = new Cell[size];
        for (int i = 0; i<size; i++){
            cells[i] = new Cell();
        }
    }

    public Cell[] getCells() {
        return cells;
    }

    public Cell getCell(int i) {
        return cells[i];
    }


    public void setCell(Cell cell, int i) {
        this.cells[i] = cell;
    }
    public static Stage setdebugStage(){
        Stage myStage = new Stage(10);
        myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(7)),1);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Gablurb !!!!")),2);
        myStage.setCell(new Cell().setandGetEnemy(new Dragon("Gablurb !!!!")),3);
        //myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(6)),2);
        //myStage.setCell(new Cell().setAndGetMysteryBox(new MysteryBox(8)),3);
        return myStage;
    }

    public static Stage setBigstage(){
        Stage myStage = new Stage(64);
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
        return myStage;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "cells=" + Arrays.toString(cells) +
                '}';
    }
}

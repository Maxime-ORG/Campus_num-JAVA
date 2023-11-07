package main.stage;

import main.characters.Characters;

public class Cell {
    private Characters enemy;
    private MysteryBox mysteryBox;

    public Cell() {

    }

    public Cell setAndGetMysteryBox(MysteryBox mysteryBox) {
        this.mysteryBox = mysteryBox;
        return this;
    }

    public Cell setandGetEnemy(Characters enemy) {
        this.enemy = enemy;
        return this;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "enemy=" + enemy +
                ", mysteryBox=" + mysteryBox +
                '}';
    }

    public Characters getEnemy() {
        return enemy;
    }


    public MysteryBox getMysteryBox() {
        return mysteryBox;
    }
}

package main.equipement.EquipementDefensif;

import main.characters.Characters;

public abstract class Philtre extends EquipementDefensif{
    public Philtre(String name) {
        super(name);
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this);
    }
}

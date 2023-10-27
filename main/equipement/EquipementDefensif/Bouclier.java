package main.equipement.EquipementDefensif;

import main.characters.Characters;

public abstract class Bouclier extends EquipementDefensif{
    public Bouclier(String name) {
        super(name);
    }


    @Override
    public void displayInvStyle() {
        System.out.println(this);
    }
}

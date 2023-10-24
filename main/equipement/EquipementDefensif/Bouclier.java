package main.equipement.EquipementDefensif;

import main.characters.Characters;

public class Bouclier extends EquipementDefensif{
    public Bouclier(String name) {
        super(name);
    }

    @Override
    public void interact(Characters myCharacter){
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this);
    }
}

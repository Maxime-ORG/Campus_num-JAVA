package main.equipement.EquipementDefensif;

import main.characters.Characters;

public class Philtre extends EquipementDefensif{
    public Philtre(String name) {
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

package main.equipement.EquipementOffensif;

import main.Case;
import main.characters.Characters;

public abstract class Arme extends EquipementOffensif implements Case {
    public Arme(String name) {
        super(name);
    }



    @Override
    public void displayInvStyle() {
        System.out.println(this);
    }
}

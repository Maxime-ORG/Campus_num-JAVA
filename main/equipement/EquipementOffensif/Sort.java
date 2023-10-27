package main.equipement.EquipementOffensif;

import main.characters.Characters;

public abstract class Sort extends EquipementOffensif {
    public Sort(String name) {
        super(name);
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this);
    }
}

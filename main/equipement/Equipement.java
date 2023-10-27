package main.equipement;

import main.InventoryKit;
import main.characters.Characters;

public abstract class Equipement implements InventoryKit {
    private String name;

    public Equipement(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


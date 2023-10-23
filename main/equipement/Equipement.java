package main.equipement;

import main.characters.Characters;

public abstract class Equipement {
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
    public abstract void interact(Characters myCharacter);
}


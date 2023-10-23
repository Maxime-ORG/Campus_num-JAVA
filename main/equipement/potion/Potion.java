package main.equipement.potion;

import main.characters.Characters;
import main.equipement.Equipement;

public class Potion extends Equipement {
    private int LifeAdd;

    public Potion(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return "Main.equipement.Potion{" +
                ", LifeAdd=" + LifeAdd +
                '}';
    }

    public void setLifeAdd(int lifeAdd) {
        LifeAdd = lifeAdd;
    }

    public int getLifeAdd() {
        return LifeAdd;
    }

    @Override
    public void interact(Characters myCharacter){
    }
}

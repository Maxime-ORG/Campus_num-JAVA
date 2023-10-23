package main.equipement.EquipementDefensif;

import main.equipement.Equipement;

public abstract class EquipementDefensif extends Equipement {
    private int defense;

    public EquipementDefensif(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "MMain.equipement.EquipementDefensif{" +
                ", defense=" + defense +
                '}';
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}

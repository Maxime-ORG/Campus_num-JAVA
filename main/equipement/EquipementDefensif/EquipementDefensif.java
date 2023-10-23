package main.equipement.EquipementDefensif;

import main.equipement.Equipement;

public abstract class EquipementDefensif extends Equipement {
    private int defense;

    public EquipementDefensif(String name){
        super(name);
        // this.setEquipementStat();
    }

    @Override
    public String toString() {
        return "Main.equipement.EquipementDefensif.Main.equipement.EquipementDefensif{" +
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

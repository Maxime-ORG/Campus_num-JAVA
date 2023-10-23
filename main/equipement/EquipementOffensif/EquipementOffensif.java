package main.equipement.EquipementOffensif;

import main.equipement.Equipement;

public abstract class EquipementOffensif extends Equipement {
    private int attack;

    public EquipementOffensif(String name){
        super(name);
        // this.setEquipementStat();
    }
    @Override
    public String toString() {
        return "Main.equipement.EquipementOffensif{" +
                ", attack=" + attack +
                '}';
    }
    public int getAttack() {
        return attack;
    }


    public void setAttack(int attack) {
        this.attack = attack;
    }
}

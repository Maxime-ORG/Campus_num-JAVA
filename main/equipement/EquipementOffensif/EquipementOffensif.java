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
        return "Main.equipement.EquipementOffensif.Main.equipement.EquipementOffensif{" +
                ", attack=" + attack +
                '}';
    }

    @Override
    public int getAttack() {
        return 0;
    }
    


    public void setAttack(int attack) {
        this.attack = attack;
    }
}

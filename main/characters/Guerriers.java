package main.characters;

import main.equipement.EquipementDefensif.Bouclier;
import main.equipement.EquipementDefensif.BouclierCuir;
import main.equipement.EquipementOffensif.Arme;
import main.equipement.EquipementOffensif.Massue;

public class Guerriers extends Characters {
    public Guerriers(String name){
        this.setName(name);

        this.setAttack(5);
        this.setCurrentLife(5);
        this.setMaxLife(10);
        this.setOffensiveItem( new Massue(""));
        this.getOffensiveItem().setAttack(0);
        this.setDefensiveItem(new BouclierCuir(""));
        this.getDefensiveItem().setDefense(0);
    }

}

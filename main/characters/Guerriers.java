package main.characters;

import main.equipement.EquipementDefensif.Bouclier;
import main.equipement.EquipementOffensif.Arme;

public class Guerriers extends Characters {
    public Guerriers(String name){
        this.setName(name);
        this.setType("Guerrier");
        this.setAttack(5);
        this.setLife(5);
        this.setOffensiveItem( new Arme(""));
        this.setDefensiveItem(new Bouclier(""));
    }
}

package main.characters;

import main.equipement.EquipementDefensif.Bouclier;
import main.equipement.EquipementOffensif.Arme;

public class Guerriers extends Characters {
    public Guerriers(String name){
        this.setName(name);

        this.setAttack(5);
        this.setCurrentLife(5);
        this.setMaxLife(5);
        this.setOffensiveItem( new Arme(""));
        this.setDefensiveItem(new Bouclier(""));
    }

    @Override
    public String getType() {
        return "Guerrier";
    }
}

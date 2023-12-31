package main.characters;

import main.equipement.EquipementDefensif.Philtre;
import main.equipement.EquipementDefensif.PhiltreSoin;
import main.equipement.EquipementOffensif.Eclair;
import main.equipement.EquipementOffensif.Sort;

public class Magiciens extends Characters {
    public Magiciens(String name) {
        this.setName(name);

        this.setAttack(8);
        this.setCurrentLife(3);
        this.setMaxLife(6);
        this.setOffensiveItem(new Eclair(""));
        this.getOffensiveItem().setAttack(0);
        this.setDefensiveItem(new PhiltreSoin(""));
        this.getDefensiveItem().setDefense(0);
    }
}

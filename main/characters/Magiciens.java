package main.characters;

import main.equipement.EquipementDefensif.Philtre;
import main.equipement.EquipementOffensif.Sort;

public class Magiciens extends Characters {
    public Magiciens(String name) {
        this.setName(name);

        this.setAttack(8);
        this.setCurrentLife(3);
        this.setMaxLife(6);
        this.setOffensiveItem(new Sort(""));
        this.setDefensiveItem(new Philtre(""));
    }

    @Override
    public String getType() {
        return "Magicien";
    }
}

package Main;

import Main.EquipementDefensif.Philtre;
import Main.EquipementOffensif.Sort;

public class Magiciens extends Characters {
    public Magiciens(String name) {
        this.setName(name);
        this.setType("Magicien");
        this.setAttack(8);
        this.setLife(3);
        this.setOffensiveItem(new Sort(""));
        this.setDefensiveItem(new Philtre(""));
    }
}

package main.equipement.EquipementOffensif;

import main.characters.Characters;

public class Eclair extends Sort {
    public Eclair(String name) {
        super(name);
        this.setAttack(2);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementOffensif mySpell = new Eclair("God Ray");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("magiciens")) {
            if (myCharacter.getOffensiveItem().getAttack() <= mySpell.getAttack()) {
                myCharacter.setOffensiveItem(mySpell);
                System.out.println(myCharacter.getName() + " prends le sort d'éclair");
            }
        }
    }
}

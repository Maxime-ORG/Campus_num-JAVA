package main.equipement.EquipementOffensif;

import main.characters.Characters;
import main.equipement.EquipementDefensif.EquipementDefensif;
import main.equipement.EquipementDefensif.PhiltreSoin;

public class BouleDeFeu extends Sort {
    public BouleDeFeu(String name) {
        super(name);
        this.setAttack(7);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementOffensif mySpell = new BouleDeFeu("Hellfire");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("magiciens")) {
            if (myCharacter.getOffensiveItem().getAttack() <= mySpell.getAttack()) {
                myCharacter.setOffensiveItem(mySpell);
                System.out.println(myCharacter.getName() + " prends le sort de boule de feu");
            }
        }
    }
}
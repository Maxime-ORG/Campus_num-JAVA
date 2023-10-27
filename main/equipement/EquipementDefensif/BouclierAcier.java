package main.equipement.EquipementDefensif;

import main.characters.Characters;

public class BouclierAcier extends Bouclier {
    public BouclierAcier(String name) {
        super(name);
        this.setDefense(5);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementDefensif myShield = new BouclierAcier("Aegis");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("guerriers")) {
            if (myCharacter.getDefensiveItem().getDefense() <= myShield.getDefense()) {
                myCharacter.setDefensiveItem(myShield);
                System.out.println(myCharacter.getName() + " prends le bouclier en acier");
            }
        }
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this.getName()+", def :"+this.getDefense());
    }

}
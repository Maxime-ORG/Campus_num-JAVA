package main.equipement.EquipementDefensif;

import main.characters.Characters;

public class BouclierCuir extends Bouclier {
    public BouclierCuir(String name) {
        super(name);
        this.setDefense(3);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementDefensif myShield = new BouclierCuir("Aegis");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("guerriers")) {
            if (myCharacter.getDefensiveItem().getDefense() <= myShield.getDefense()) {
                myCharacter.setDefensiveItem(myShield);
                System.out.println(myCharacter.getName() + " prends le bouclier en cuir");
            }
        }
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this.getName()+", def :"+this.getDefense());
    }
}
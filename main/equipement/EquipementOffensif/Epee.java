package main.equipement.EquipementOffensif;

import main.characters.Characters;

public class Epee extends Arme {
    public Epee(String name) {
        super(name);
        this.setAttack(5);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementOffensif myWeapon = new Epee("Excalibur");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("guerriers")) {
            if (myCharacter.getOffensiveItem().getAttack() <= myWeapon.getAttack()) {
                myCharacter.setOffensiveItem(myWeapon);
                System.out.println(myCharacter.getName() + " prends l'épée");
            }
        }
    }
}
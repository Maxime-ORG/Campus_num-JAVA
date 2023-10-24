package main.equipement.EquipementOffensif;

import main.characters.Characters;

public class Massue extends Arme {
    public Massue(String name) {
        super(name);
        this.setAttack(3);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementOffensif myWeapon = new Massue("Wharhammer");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("guerriers")) {
            if (myCharacter.getOffensiveItem().getAttack() <= myWeapon.getAttack()) {
                myCharacter.setOffensiveItem(myWeapon);
                System.out.println(myCharacter.getName() + " prends la massue");
            }
        }
    }


    @Override
    public void displayInvStyle() {
        System.out.println(this.getName()+", atk :"+this.getAttack());
    }
}
package main.equipement.EquipementDefensif;

import main.characters.Characters;

public class PhiltreSoin extends Philtre {
    public PhiltreSoin(String name) {
        super(name);
        this.setDefense(1);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementDefensif myPhiltre = new PhiltreSoin("Life water");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("magiciens")) {
            if (myCharacter.getDefensiveItem().getDefense() <= myPhiltre.getDefense()) {
                myCharacter.setDefensiveItem(myPhiltre);
                System.out.println(myCharacter.getName() + " prends le philtre de soin");
            }
        }
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this.getName()+", def :"+this.getDefense());
    }
}

package main.equipement.EquipementDefensif;

import main.characters.Characters;

public class PhiltreProtection extends Philtre {
    public PhiltreProtection(String name) {
        super(name);
        this.setDefense(3);
    }

    @Override
    public void interact(Characters myCharacter) {
        EquipementDefensif myPhiltre = new PhiltreProtection("Protegro");
        if (myCharacter.getClass().getSimpleName().equalsIgnoreCase("magiciens")) {
            if (myCharacter.getDefensiveItem().getDefense() <= myPhiltre.getDefense()) {
                myCharacter.setDefensiveItem(myPhiltre);
                System.out.println(myCharacter.getName() + " prends le philtre de protection");
            }
        }
    }
    @Override
    public void displayInvStyle() {
        System.out.println(this.getName()+", def :"+this.getDefense());
    }
}

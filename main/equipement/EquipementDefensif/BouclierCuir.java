package main.equipement.EquipementDefensif;

import main.ItemVisitor;
import main.ItemElement;
import main.characters.Characters;

public class BouclierCuir extends Bouclier implements ItemElement {
    public BouclierCuir(String name) {
        super(name);
        this.setDefense(2);
    }


    @Override
    public void accept(ItemVisitor v) {
        v.visit(this);
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
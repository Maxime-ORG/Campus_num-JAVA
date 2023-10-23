package main.equipement;

import main.characters.Characters;
import main.equipement.EquipementOffensif.EquipementOffensif;
import main.equipement.EquipementOffensif.Massue;

public class GrandesPotions extends Potion{
    public GrandesPotions(String name){
        super(name);
        this.setLifeAdd(5);
    }

    @Override
    public void interact(Characters myCharacter){
        int startingLife = myCharacter.getCurrentLife();
        GrandesPotions myGreatPotion = new GrandesPotions("Super potion");
        if (myCharacter.getMaxLife() > myCharacter.getCurrentLife()){
            myCharacter.setCurrentLife(myCharacter.getCurrentLife() + myGreatPotion.getLifeAdd());
            if (myCharacter.getMaxLife() < myCharacter.getCurrentLife()){
                myCharacter.setCurrentLife(myCharacter.getMaxLife());
            }
        }
        System.out.println(myCharacter.getName()+" prends la Super potion et passe de :"+startingLife+"hp à "+myCharacter.getCurrentLife()+"hp");
    }
}

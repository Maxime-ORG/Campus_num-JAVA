package main.equipement.potion;

import main.characters.Characters;

public class StandardPotion extends Potion{
    public StandardPotion(String name){
        super(name);
        this.setLifeAdd(2);
    }

    @Override
    public void interact(Characters myCharacter){
        int startingLife = myCharacter.getCurrentLife();
        StandardPotion myStandartPotion = new StandardPotion("classic potion");
        if (myCharacter.getMaxLife() > myCharacter.getCurrentLife()){
            myCharacter.setCurrentLife(myCharacter.getCurrentLife() + myStandartPotion.getLifeAdd());
            if (myCharacter.getMaxLife() < myCharacter.getCurrentLife()){
                myCharacter.setCurrentLife(myCharacter.getMaxLife());
            }
        }
        System.out.println(myCharacter.getName()+" prends la potion classique et passe de :"+startingLife+"hp à "+myCharacter.getCurrentLife()+"hp");
    }

    @Override
    public void displayInvStyle() {
        System.out.println(this.getName()+", soin="+this.getLifeAdd());
    }
}

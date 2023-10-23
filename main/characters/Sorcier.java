package main.characters;

public class Sorcier extends main.characters.Characters{
    public Sorcier(String name){
        super(name, "Sorcier");
        this.setAttack(2);
        this.setCurrentLife(9);
    }

    @Override
    public String getType() {
        return "Sorcier";
    }
}

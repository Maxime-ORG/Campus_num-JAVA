package main.characters;

public class Gobelin extends main.characters.Characters{
    public Gobelin(String name){
        super(name, "Gobelin");
        this.setAttack(1);
        this.setCurrentLife(6);
    }

    @Override
    public String getType() {
        return "Gobelin";
    }
}


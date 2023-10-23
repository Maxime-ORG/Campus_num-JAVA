package main.characters;

public class Dragon extends main.characters.Characters {
    public Dragon(String name){
        super(name, "Dragon");
        this.setAttack(4);
        this.setCurrentLife(15);
    }

    @Override
    public String getType() {
        return "dragon";
    }
}
package main.characters;

public class Dragon extends main.characters.Characters {
    public Dragon(String name){
        super(name, "Dragon");
        this.setAttack(4);
        this.setLife(15);
    }
}
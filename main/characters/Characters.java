package main.characters;

import main.equipement.EquipementDefensif.EquipementDefensif;
import main.equipement.EquipementOffensif.EquipementOffensif;

public abstract class Characters {

    private String name;
    private int life;
    private int attack;
    private EquipementOffensif OffensiveItem;
    private EquipementDefensif DefensiveItem;
    private int Position;


    public Characters(String name, String type) {
        this.name = name;

    }

    public Characters(String name){
        this(name,"guerrier");
    }

    public Characters(){
        this("Maxime", "guerrier");
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public EquipementDefensif getDefensiveItem() {
        return DefensiveItem;
    }

    public EquipementOffensif getOffensiveItem() {
        return OffensiveItem;
    }

    public int getPosition() {
        return Position;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefensiveItem(EquipementDefensif defensiveItem) {
        DefensiveItem = defensiveItem;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffensiveItem(EquipementOffensif offensiveItem) {
        OffensiveItem = offensiveItem;
    }

    public void setPosition(int position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Character{" +
                "type='" + this.getType() + '\'' +
                ", name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", OffensiveItem=" + OffensiveItem +
                ", DefensiveItem=" + DefensiveItem +
                '}';
    }
}

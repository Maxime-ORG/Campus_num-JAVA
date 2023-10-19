package Main;

import Main.EquipementDefensif.EquipementDefensif;
import Main.EquipementOffensif.EquipementOffensif;

abstract class Characters {
    private String type;
    private String name;
    private int life;
    private int attack;
    private EquipementOffensif OffensiveItem;
    private EquipementDefensif DefensiveItem;
    private int Position;


    public Characters(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Characters(String name){
        this(name,"guerrier");
    }

    public Characters(){
        this("Maxime", "guerrier");
    }

    public void printStat(){
        System.out.println("type : " + this.type);
        System.out.println("nom : " + this.name);
        System.out.println("life : " + this.life);
        System.out.println("attack : " + this.attack);
        System.out.println("offensive Item name : " + this.OffensiveItem.getName());
        System.out.println("offensive Item attack : " + this.OffensiveItem.getAttack());
        System.out.println("defensive Item name : " + this.DefensiveItem.getName());
        System.out.println("defensive Item defense : " + this.DefensiveItem.getDefense());
    }

    public String getType() {
        return type;
    }

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

    public void setType(String type) {
        this.type = type;
    }

    public void setPosition(int position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Character{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", OffensiveItem=" + OffensiveItem +
                ", DefensiveItem=" + DefensiveItem +
                '}';
    }
}

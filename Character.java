import java.util.Scanner;
public class Character {
    private String type;
    private String name;
    private int life;
    private int attack;
    private EquipementOffensif OffensiveItem;
    private EquipementDefensif DefensiveItem;

    int a = 14;



    public Character(String name, String type) {
        this.name = name;
        this.type = type;
        this.setStatAndEquipement();
    }

    public Character(String name){
        this(name,"guerrier");
    }

    public Character(){
        this("Maxime", "guerrier");
    }

    public void setStatAndEquipement(){

        if(this.type.equalsIgnoreCase("guerrier")){
            this.life = 10;
            this.attack = 10;
            this.OffensiveItem = new EquipementOffensif("Arme");
            this.DefensiveItem = new EquipementDefensif("Bouclier");
        } else if (this.type.equalsIgnoreCase("magicien")) {
            this.life = 6;
            this.attack = 15;
            this.OffensiveItem = new EquipementOffensif("Sort");
            this.DefensiveItem = new EquipementDefensif("Philtre");
        } else {
            this.life = -1;
            this.attack = -1;
        }
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
}

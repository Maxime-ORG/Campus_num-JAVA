public class EquipementOffensif {
    private String type;
    private int attack;
    private String name;

    public EquipementOffensif(String type){
        this.type = type;
        this.setEquipementStat();
    }

    public void setEquipementStat(){
        if (this.type.equalsIgnoreCase("Sort")){
            this.attack = 20;
            this.name = "Boule de feu";
        } else if (this.type.equalsIgnoreCase("Arme")){
            this.attack = 10;
            this.name = "Excalibur";
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }
}

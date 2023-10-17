public class EquipementDefensif {
    private String type;
    private int defense;
    private String name;

    public EquipementDefensif(String type){
        this.type = type;
        this.setEquipementStat();
    }

    public void setEquipementStat(){
        if (this.type.equalsIgnoreCase("Philtre")){
            this.defense = 10;
            this.name = "Philtre de soin";
        } else if (this.type.equalsIgnoreCase("Bouclier")){
            this.defense = 20;
            this.name = "Bouclier en acier";
        }
    }

    public String getType() {
        return type;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }
}

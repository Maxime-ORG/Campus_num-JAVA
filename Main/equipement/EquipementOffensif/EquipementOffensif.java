package Main.equipement.EquipementOffensif;

public abstract class EquipementOffensif {
    private int attack;
    private String name;

    public EquipementOffensif(String name){
        this.name = name;
        // this.setEquipementStat();
    }
    @Override
    public String toString() {
        return "Main.equipement.EquipementOffensif.Main.equipement.EquipementOffensif{" +
                ", attack=" + attack +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

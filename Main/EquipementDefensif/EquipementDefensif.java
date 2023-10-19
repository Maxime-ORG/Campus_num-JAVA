package Main.EquipementDefensif;

public class EquipementDefensif {
    private int defense;
    private String name;

    public EquipementDefensif(String name){
        this.name = name;
        // this.setEquipementStat();
    }

    @Override
    public String toString() {
        return "Main.EquipementDefensif.Main.EquipementDefensif{" +
                ", defense=" + defense +
                ", name='" + name + '\'' +
                '}';
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}

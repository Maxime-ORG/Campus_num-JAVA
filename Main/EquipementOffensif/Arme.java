package Main.EquipementOffensif;

public class Arme extends EquipementOffensif {
    public Arme(String name) {
        super(name);
        setArmeStat();
    }

    public void setArmeStat() {
        if(this.getName().equalsIgnoreCase("Epée")){
            this.setAttack(5);
        } else if(this.getName().equalsIgnoreCase("Main.EquipementOffensif.Massue")){
            this.setAttack(3);
        } else {
            this.setAttack(0);
        }
    }
}

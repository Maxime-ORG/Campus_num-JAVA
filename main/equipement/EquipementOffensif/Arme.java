package main.equipement.EquipementOffensif;

public abstract class Arme extends EquipementOffensif {
    public Arme(String name) {
        super(name);
    }



    @Override
    public void displayInvStyle() {
        System.out.println(this);
    }
}

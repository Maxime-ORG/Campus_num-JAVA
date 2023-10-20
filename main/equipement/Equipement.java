package main.equipement;

public abstract class Equipement {
    private String name;

    public Equipement(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract int getAttack();
}


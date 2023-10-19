package Main.equipement;

public class Potion {
    private String name;
    private int LifeAdd;

    public Potion(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Main.equipement.Potion{" +
                "name='" + name + '\'' +
                ", LifeAdd=" + LifeAdd +
                '}';
    }

    public void setLifeAdd(int lifeAdd) {
        LifeAdd = lifeAdd;
    }
}

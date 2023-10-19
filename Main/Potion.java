package Main;

public class Potion {
    private String name;
    private int LifeAdd;

    public Potion(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Main.Potion{" +
                "name='" + name + '\'' +
                ", LifeAdd=" + LifeAdd +
                '}';
    }

    public void setLifeAdd(int lifeAdd) {
        LifeAdd = lifeAdd;
    }
}

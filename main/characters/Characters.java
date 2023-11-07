package main.characters;

import java.util.*;
import main.equipement.Equipement;
import main.equipement.EquipementDefensif.BouclierAcier;
import main.equipement.EquipementDefensif.EquipementDefensif;
import main.equipement.EquipementOffensif.BouleDeFeu;
import main.equipement.EquipementOffensif.EquipementOffensif;

public abstract class Characters {

    private String name;
    private int currentLife;
    private int maxLife;
    private int attack;
    private LinkedList<Equipement> inventory = new LinkedList<Equipement>();
    private EquipementOffensif OffensiveItem;
    private EquipementDefensif DefensiveItem;
    private int position;

    /**
     * General constructor for class Characters
     * only name attribute is specified others are null
     * @param name the string to put as name attribute
     */
    public Characters(String name) {
        this.name = name;
    }

    /**
     * constructor for class Characters
     * put "Maxime" as name attribute
     */
    public Characters(){
        this("Maxime");
    }

    /**
     * @return name attribute of this object
     */
    public String getName() {
        return name;
    }

    /**
     * @return currentLife attribute of this object
     */
    public int getCurrentLife() {
        return currentLife;
    }

    /**
     * @return attack attribute of this object
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @return DefensiveItem attribute of this object
     */
    public EquipementDefensif getDefensiveItem() {
        return DefensiveItem;
    }

    /**
     * @return OffensiveItem attribute of this object
     */
    public EquipementOffensif getOffensiveItem() {
        return OffensiveItem;
    }

    /**
     * @return position attribute of this object
     */
    public int getPosition() {
        return position;
    }

    /**
     * change the attack attribute by the parameter
     * @param attack the int to put in attack attribute
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * change the DefensiveItem attribute by the parameter
     * @param defensiveItem the DefensiveItem to put in DefensiveItem attribute
     */
    public void setDefensiveItem(EquipementDefensif defensiveItem) {
        DefensiveItem = defensiveItem;
    }

    /**
     * change the currentLife attribute by the parameter
     * @param currentLife the int to put in currentLife attribute
     */
    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    /**
     * change the name attribute by the parameter
     * @param name the String to put in name attribute
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * change the OffensiveItem attribute by the parameter
     * @param offensiveItem the OffensiveItem to put in OffensiveItem attribute
     */
    public void setOffensiveItem(EquipementOffensif offensiveItem) {
        OffensiveItem = offensiveItem;
    }

    /**
     * change the position attribute by the parameter
     * @param position the int to put in position attribute
     */
    public void setPosition(int position) {
        position = position;
    }

    /**
     * @return maxLife attribute of the object
     */
    public int getMaxLife() {
        return maxLife;
    }

    /**
     * change the maxLife attribute by the parameter
     * @param maxLife the int to put in maxLife attribute
     */
    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    /**
     * @return inventory attribute of the oject
     */
    public LinkedList<Equipement> getInventory() {
        return inventory;
    }

    /**
     * change the inventory attribute by the parameter
     * @param inventory the LinkedList of Equipement to put in inventory attribute
     */
    public void setInventory(LinkedList<Equipement> inventory) {
        this.inventory = inventory;
    }

    /**
     * used to have a string with all trribute to display
     * @return a string with all attribute
     */
    @Override
    public String toString() {
        return "Character{" +
                "type='" + this.getClass().getSimpleName() + '\'' +
                ", name='" + name + '\'' +
                ", life=" + currentLife +
                ", attack=" + attack +
                ", OffensiveItem=" + OffensiveItem +
                ", DefensiveItem=" + DefensiveItem +
                '}';
    }
}

package main.stage;

import main.equipement.Equipement;
import main.equipement.EquipementDefensif.BouclierAcier;
import main.equipement.EquipementDefensif.BouclierCuir;
import main.equipement.EquipementDefensif.PhiltreProtection;
import main.equipement.EquipementDefensif.PhiltreSoin;
import main.equipement.EquipementOffensif.BouleDeFeu;
import main.equipement.EquipementOffensif.Eclair;
import main.equipement.EquipementOffensif.Epee;
import main.equipement.EquipementOffensif.Massue;
import main.equipement.GrandesPotions;
import main.equipement.StandardPotion;

public class MysteryBox {
    private Equipement mysteryEquipement;

    public MysteryBox(int rand){
        mysteryEquipement = switch (rand) {
            case 0 -> new BouleDeFeu("boule de feu");
            case 1 -> new BouclierAcier("Bouclier Acier");
            case 2 -> new BouclierCuir("Bouclier Cuir");
            case 3 -> new PhiltreProtection("Philtre Protection");
            case 4 -> new PhiltreSoin("Philtre Soin");
            case 5 -> new Eclair("Eclair");
            case 6 -> new Epee("Epee");
            case 7 -> new Massue("Massue");
            case 8 -> new GrandesPotions("Grandes Potions");
            case 9 -> new StandardPotion("Standard Potion");
            default -> null;
        };
    }

    public Equipement getMysteryEquipement() {
        return mysteryEquipement;
    }

    public void setMysteryEquipement(Equipement mysteryEquipement) {
        this.mysteryEquipement = mysteryEquipement;
    }
}

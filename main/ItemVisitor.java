package main;

import main.equipement.EquipementDefensif.BouclierAcier;
import main.equipement.EquipementDefensif.BouclierCuir;

public interface ItemVisitor {
    void visit(BouclierAcier bou);
    void visit(BouclierCuir bou);

}

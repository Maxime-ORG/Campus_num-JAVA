package main;

import main.equipement.EquipementDefensif.BouclierAcier;
import main.equipement.EquipementDefensif.BouclierCuir;

public abstract class ItemVisitorImpl implements ItemVisitor {
    @Override
    public void visit(BouclierAcier bou) {
        System.out.println(
                "test");
    }

    @Override
    public void visit(BouclierCuir bou) {
        System.out.println(
                "test ");
    }
}

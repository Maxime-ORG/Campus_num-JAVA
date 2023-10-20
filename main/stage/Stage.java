package main.stage;

import java.util.Arrays;

public class Stage {
    private Cell[] cells;
    public Stage(int size){
        constructCells(size);
    }

    public void constructCells(int size){
        this.cells = new Cell[size];
        for (int i = 0; i<size; i++){
            cells[i] = new Cell();
        }
    }

    public Cell[] getCells() {
        return cells;
    }

    public Cell getCell(int i) {
        return cells[i];
    }


    public void setCell(Cell cell, int i) {
        this.cells[i] = cell;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "cells=" + Arrays.toString(cells) +
                '}';
    }
}

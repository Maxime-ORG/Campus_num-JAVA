package Main;

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


}

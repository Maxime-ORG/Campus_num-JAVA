public class Main {
    public static void main(String[] args) {
        //transport(34,9);
        Menu myMenu = new Menu();
        myMenu.menuCreation();
    }

    private static void transport(int crates, int truckSize) {
        while (crates > 0) {
            if (crates >= truckSize) {
                System.out.println("je suis un camion de " + truckSize);
            } else {
                System.out.println("je suis un camion de " + crates);
            }
            crates = crates - truckSize;
        }
    }
}


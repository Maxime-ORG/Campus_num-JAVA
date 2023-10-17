public class Main {
  public static void main(String[] args) {
    transport(20,6);
  }

  public static void transport(int crates, int truckSize){
    int currentTruck = 0;
    while(crates > 0){
      if (crates >= truckSize) {
        System.out.println("je suis un camion de " + truckSize);
      } else {
        System.out.println("je suis un camion de " + crates);
      }
      crates = crates - truckSize;
    }
  }
}


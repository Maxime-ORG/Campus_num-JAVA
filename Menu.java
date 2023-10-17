import java.util.Scanner;
public class Menu {
    public Menu(){

    }
    public void menuCreation(){
        Scanner clavier = new Scanner(System.in);
        String testWhile = "Y";
        while (testWhile.equalsIgnoreCase("Y") || testWhile.equalsIgnoreCase("Yes")){

            System.out.print("Saisir le nom du joueur : ");
            String name = clavier.nextLine();
            System.out.print("Saisir le type du joueur (guerrier ou magicien) : ");
            String type = clavier.nextLine();
            Character myCharacter = new Character(name,type);
            myCharacter.printStat();

            System.out.print("Créer un autre joueur ? (yes/no)");
            testWhile = clavier.nextLine();
        }
    }
}

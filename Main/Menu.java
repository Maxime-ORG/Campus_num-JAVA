package Main;

import Main.EquipementDefensif.BouclierAcier;
import Main.EquipementDefensif.BouclierCuir;
import Main.EquipementDefensif.PhiltreProtection;
import Main.EquipementDefensif.PhiltreSoin;
import Main.EquipementOffensif.BouleDeFeu;
import Main.EquipementOffensif.Eclair;
import Main.EquipementOffensif.Epee;
import Main.EquipementOffensif.Massue;

import java.util.Scanner;

public class Menu {
    private Characters myCharacters;
    private Scanner clavier = new Scanner(System.in);

    public Menu() {

    }

    public void menuMain(Stage myStage) {
        String usertype = "Start";
        while (!usertype.equals("EXIT")) {
            System.out.println("  1  - Créer personnage");
            System.out.println("  2  - Modifier personnage");
            System.out.println("  3  - Afficher personnage");
            System.out.println("  4  - Start");
            System.out.println("EXIT - Quitter");
            usertype = clavier.nextLine();
            if (usertype.equals("1")) {
                myCharacters = menuCreation();

            } else if (usertype.equals("2")) {
                myCharacters = menuModification(myCharacters);

            } else if (usertype.equals("3")) {
                System.out.println("Mon personnage : " + myCharacters.toString());

            } else if (usertype.equals("4")) {
                if (!(myCharacters == null)) {
                    menuStart(myCharacters, myStage);
                } else {
                    System.out.println("Personnage indisponible, voulez vous un créer un par défault ? (Yes/No)");
                    usertype = clavier.nextLine();
                    if (usertype.equalsIgnoreCase("yes") || usertype.equalsIgnoreCase("y")) {
                        myCharacters = new Guerriers("Maxime");
                        menuStart(myCharacters, myStage);
                    }
                }
            }
        }
    }

    public Characters menuModification(Characters myCharacters) {
        String userInput = "Start";
        while (!userInput.equals("7")) {
            System.out.println("1 - changer le nom");
            System.out.println("2 - changer le type");
            System.out.println("3 - changer la vie");
            System.out.println("4 - changer l'attaque");
            System.out.println("5 - changer l'equipement offensif");
            System.out.println("6 - changer l'equipement defensif");
            System.out.println("7 - quitter");
            userInput = clavier.nextLine();


            if (userInput.equals("1")) {
                System.out.println("entrez le nouveau nom");
                userInput = clavier.nextLine();
                myCharacters.setName(userInput);
            } else if (userInput.equals("2")) {
                System.out.println("entrez le nouveau type");
                userInput = clavier.nextLine();
                if(userInput.equalsIgnoreCase("guerrier")){
                    myCharacters = new Guerriers(myCharacters.getName());
                } else if (userInput.equalsIgnoreCase("magicien")) {
                    myCharacters = new Magiciens(myCharacters.getName());
                }
            } else if (userInput.equals("3")) {
                System.out.println("entrez la nouvelle vie");
                int intUserInput = clavier.nextInt();
                myCharacters.setLife(intUserInput);
            } else if (userInput.equals("4")) {
                System.out.println("entrez la nouvelle attaque");
                int intUserInput = clavier.nextInt();
                myCharacters.setAttack(intUserInput);
            } else if (userInput.equals("5")) {
                System.out.println("entrez le nouveau equipement offensif");
                if (myCharacters.getType().equalsIgnoreCase("magicien")) {
                    System.out.println("Main.EquipementDefensif.Philtre de protection / Main.EquipementDefensif.Philtre de soin");
                    userInput = clavier.nextLine();
                    if (userInput.equalsIgnoreCase("Main.EquipementDefensif.Philtre de protection")){
                        myCharacters.setDefensiveItem(new PhiltreProtection(userInput));
                    } else if (userInput.equalsIgnoreCase("Main.EquipementDefensif.Philtre de soin")) {
                        myCharacters.setDefensiveItem(new PhiltreSoin(userInput));
                    }
                } else if (myCharacters.getType().equalsIgnoreCase("guerrier")) {
                    System.out.println("Main.EquipementDefensif.Bouclier en acier / Main.EquipementDefensif.Bouclier en cuir");
                    userInput = clavier.nextLine();
                    if (userInput.equalsIgnoreCase("Main.EquipementDefensif.Bouclier en acier")){
                        myCharacters.setDefensiveItem(new BouclierAcier(userInput));
                    } else if (userInput.equalsIgnoreCase("Main.EquipementDefensif.Bouclier en cuir")) {
                        myCharacters.setDefensiveItem(new BouclierCuir(userInput));
                    }
                }
            } else if (userInput.equals("6")) {
                System.out.println("entrez le nouveau equipement defensif");
                if (myCharacters.getType().equalsIgnoreCase("magicien")) {
                    System.out.println("Boule de Feu / Main.EquipementOffensif.Eclair");
                    userInput = clavier.nextLine();
                    if (userInput.equalsIgnoreCase("Boule de Feu")){
                        myCharacters.setOffensiveItem(new BouleDeFeu(userInput));
                    } else if (userInput.equalsIgnoreCase("Main.EquipementOffensif.Eclair")) {
                        myCharacters.setOffensiveItem(new Eclair(userInput));
                    }
                } else if (myCharacters.getType().equalsIgnoreCase("guerrier")) {
                    System.out.println("Main.EquipementOffensif.Epee / Main.EquipementOffensif.Massue");
                    userInput = clavier.nextLine();
                    if (userInput.equalsIgnoreCase("epee")){
                        myCharacters.setOffensiveItem(new Epee(userInput));
                    } else if (userInput.equalsIgnoreCase("Main.EquipementOffensif.Massue")) {
                        myCharacters.setOffensiveItem(new Massue(userInput));
                    }
                }
            }
        }
        return myCharacters;
    }

    public Characters menuCreation() {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir le nom du joueur : ");
        String name = clavier.nextLine();
        System.out.print("Saisir le type du joueur (guerrier ou magicien) : ");
        String type = clavier.nextLine();
        if (!name.isEmpty() && type.equalsIgnoreCase("guerrier")) {
            myCharacters = new Guerriers(name);
        } else if (!name.isEmpty() && type.equalsIgnoreCase("magicien")) {
            myCharacters = new Magiciens(name);
        } else if (!name.isEmpty() && !type.isEmpty()) {
            myCharacters = new Guerriers(name);
        } else if (!name.isEmpty()) {
            myCharacters = new Guerriers(name);
        } else {
            myCharacters = new Guerriers("Maxime");
        }
        return myCharacters;
    }

    public void menuStart(Characters myCharacters, Stage myStage) {
        myCharacters.setPosition(0);
        while (myCharacters.getPosition() < myStage.getCells().length) {
            int dice = Main.getRandomBetween(1, 6);
            myCharacters.setPosition(myCharacters.getPosition() + dice);
            System.out.println("ma position : " + myCharacters.getPosition() + " position après le lancer de dé : " + dice);
        }
    }

}
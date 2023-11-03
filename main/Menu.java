package main;

import main.databaseConnections.DatabaseConnections;
import main.equipement.EquipementDefensif.BouclierAcier;
import main.equipement.EquipementDefensif.BouclierCuir;
import main.equipement.EquipementDefensif.PhiltreProtection;
import main.equipement.EquipementDefensif.PhiltreSoin;
import main.equipement.EquipementOffensif.BouleDeFeu;
import main.equipement.EquipementOffensif.Eclair;
import main.equipement.EquipementOffensif.Epee;
import main.equipement.EquipementOffensif.Massue;
import main.characters.Characters;
import main.characters.Guerriers;
import main.characters.Magiciens;
import main.stage.Stage;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private Characters myCharacters;
    private Scanner clavier = new Scanner(System.in);
    private DatabaseConnections dbCon;

    {
        try {
            dbCon = new DatabaseConnections();
        } catch (SQLException e) {
            System.out.println("erreur de connection à la BDD");
            dbCon = null;
        }
    }

    public Menu() {

    }

    public Characters menuMain() {
        String usertype = "Start";
        while (!usertype.equals("EXIT")) {
            System.out.println("-------------------------------------------");
            System.out.println("  1  - Créer personnage");
            System.out.println("  2  - Modifier personnage");
            System.out.println("  3  - Afficher personnage");
            System.out.println("  4  - Start");
            System.out.println("EXIT - Quitter");
            System.out.println("-------------------------------------------");
            usertype = clavier.nextLine();
            switch (usertype) {
                case "1" -> myCharacters = menuCreation();
                case "2" -> myCharacters = menuModification(myCharacters);
                case "3" -> System.out.println("Mon personnage : " + myCharacters.toString());
                case "4" -> {
                    if (!(myCharacters == null)) {
                        Game myGame = new Game(myCharacters);
                        myGame.play(false);
                    } else {
                        System.out.println("Personnage indisponible, voulez vous un créer un par défault ? (Yes/No)");
                        usertype = clavier.nextLine();
                        if (usertype.equalsIgnoreCase("yes") || usertype.equalsIgnoreCase("y")) {
                            myCharacters = new Guerriers("Maxime");
                            Game myGame = new Game(myCharacters);
                            myGame.play(false);
                        }
                    }
                }
                case "EXIT" -> System.out.println("Merci d'avoir joué, Bye Bye !");
            }
        }
        return myCharacters;
    }

    public Characters menuModification(Characters myCharacters) {
        String userInput = "Start";
        while (!userInput.equals("7")) {
            System.out.println("-------------------------------------------");
            System.out.println("1 - changer le nom");
            System.out.println("2 - changer le type");
            System.out.println("3 - changer la vie");
            System.out.println("4 - changer l'attaque");
            System.out.println("5 - changer l'equipement offensif");
            System.out.println("6 - changer l'equipement defensif");
            System.out.println("7 - quitter");
            System.out.println("-------------------------------------------");
            userInput = clavier.nextLine();


            switch (userInput) {
                case "1" -> {
                    System.out.println("entrez le nouveau nom");
                    userInput = clavier.nextLine();
                    myCharacters.setName(userInput);
                }
                case "2" -> {
                    System.out.println("entrez le nouveau type");
                    userInput = clavier.nextLine();
                    if (userInput.equalsIgnoreCase("guerrier")) {
                        myCharacters = new Guerriers(myCharacters.getName());
                    } else if (userInput.equalsIgnoreCase("magicien")) {
                        myCharacters = new Magiciens(myCharacters.getName());
                    }
                }
                case "3" -> {
                    System.out.println("entrez la nouvelle vie");
                    int intUserInput = clavier.nextInt();
                    myCharacters.setCurrentLife(intUserInput);
                }
                case "4" -> {
                    System.out.println("entrez la nouvelle attaque");
                    int intUserInput = clavier.nextInt();
                    myCharacters.setAttack(intUserInput);
                }
                case "5" -> {
                    System.out.println("entrez le nouveau equipement offensif");
                    if (myCharacters.getType().equalsIgnoreCase("magicien")) {
                        System.out.println("Philtre de protection / Philtre de soin");
                        userInput = clavier.nextLine();
                        if (userInput.equalsIgnoreCase("Philtre de protection")) {
                            myCharacters.setDefensiveItem(new PhiltreProtection(userInput));
                        } else if (userInput.equalsIgnoreCase("Philtre de soin")) {
                            myCharacters.setDefensiveItem(new PhiltreSoin(userInput));
                        }
                    } else if (myCharacters.getType().equalsIgnoreCase("guerrier")) {
                        System.out.println("Bouclier en acier / Bouclier en cuir");
                        userInput = clavier.nextLine();
                        if (userInput.equalsIgnoreCase("Bouclier en acier")) {
                            myCharacters.setDefensiveItem(new BouclierAcier(userInput));
                        } else if (userInput.equalsIgnoreCase("Bouclier en cuir")) {
                            myCharacters.setDefensiveItem(new BouclierCuir(userInput));
                        }
                    }
                }
                case "6" -> {
                    System.out.println("entrez le nouveau equipement defensif");
                    if (myCharacters.getType().equalsIgnoreCase("magicien")) {
                        System.out.println("Boule de Feu / Eclair");
                        userInput = clavier.nextLine();
                        if (userInput.equalsIgnoreCase("Boule de Feu")) {
                            myCharacters.setOffensiveItem(new BouleDeFeu(userInput));
                        } else if (userInput.equalsIgnoreCase("Eclair")) {
                            myCharacters.setOffensiveItem(new Eclair(userInput));
                        }
                    } else if (myCharacters.getType().equalsIgnoreCase("guerrier")) {
                        System.out.println("Epee / Massue");
                        userInput = clavier.nextLine();
                        if (userInput.equalsIgnoreCase("epee")) {
                            myCharacters.setOffensiveItem(new Epee(userInput));
                        } else if (userInput.equalsIgnoreCase("Massue")) {
                            myCharacters.setOffensiveItem(new Massue(userInput));
                        }
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
            myCharacters = new Guerriers("cheated hero");
            myCharacters.setAttack(100);
        }
        try {
            dbCon.insertIntoCharacters(myCharacters);
        } catch (SQLException e) {
            System.out.println("erreur à la création de personnage en BDD");
        } catch (NullPointerException E){
            System.out.println("erreur à la création de personnage en BDD");
        }
        return myCharacters;
    }

    public void menuStart(Characters myCharacters) {
        Stage myStage = new Stage(64);
        myCharacters.setPosition(0);
        while (myCharacters.getPosition() < myStage.getCells().length) {
            int dice = Game.getRandomBetween(1, 6);
            myCharacters.setPosition(myCharacters.getPosition() + dice);
            System.out.println("ma position : " + myCharacters.getPosition() + " position après le lancer de dé : " + dice);
        }
    }

}

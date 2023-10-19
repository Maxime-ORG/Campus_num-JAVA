package Main;

import Main.characters.Characters;
import Main.stage.Stage;

import java.util.Random;

public class Game {
    private Stage MyStage;
    private Characters characters;

    public Game(){
        MyStage = new Stage(64);
    }

    public void JouerUnTour(){

    }
    public static int getRandomBetween(int min, int max){
        Random ran = new Random();
        int myRandom = ran.nextInt(max - min + 1) + min;
        return myRandom;
    }
}

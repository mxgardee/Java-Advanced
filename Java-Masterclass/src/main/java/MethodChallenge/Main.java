/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodChallenge;

/**
 *
 * @author 27605 (Muhammed Gardee)
 */

public class Main {

    public static void main(String[] args) {

        int Score = CalculateHighScorePosition(1500);
        DisplayHighScorePosition("Sean",Score);

        Score = CalculateHighScorePosition(900);
        DisplayHighScorePosition("James",Score);

        Score = CalculateHighScorePosition(400);
        DisplayHighScorePosition("Barney",Score);

        Score = CalculateHighScorePosition(50);
        DisplayHighScorePosition("Theo",Score);
    }

    public static void DisplayHighScorePosition(String name,int score){
        System.out.println(name + "managed to get into position as a" + score + "on the high score table.");
    }
    public static int CalculateHighScorePosition(int Score){
        if (Score >= 1000){
            return 1;
        } else if (Score >= 500){
            return 2;
        }else if (Score >= 100){
            return 3;
        }

            return 4;
    }
}

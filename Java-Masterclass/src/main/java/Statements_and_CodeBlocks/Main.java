/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statements_and_CodeBlocks;

/**
 *
 * @author 27605 (Muhammed Gardee)
 */

public class Main {

    public static void main(String[] args) {
	boolean GameOver = true;
	int Score = 4000;
	int LevelCompl = 5;
	int Bonus = 100;
		if (GameOver){
                    int FinalScore = Score + (LevelCompl * Bonus);
			System.out.println("Your final score is:" + FinalScore);
		}

		if (GameOver){
                    Score = 10000;
                    LevelCompl = 8;
                    Bonus = 200;
			System.out.println("Score: " + Score + "\nLevelCompleted: " + LevelCompl +
					"\nBonus: " + Bonus + "\nFinal Score: " + (Score + LevelCompl + Bonus));
		}
    }
}

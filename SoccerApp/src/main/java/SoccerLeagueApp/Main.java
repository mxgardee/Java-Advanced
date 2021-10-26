/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoccerLeagueApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\27605\\OneDrive\\Documents\\NetBeansProjects\\SoccerApp\\data.txt");
        Scanner sc = null;
        String match, team1, team2, score1, score2;

        String [] sides, l1,l2;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            match = sc.nextLine();
            sides = match.split(",");
            l1 = sides[0].split(" ");
            team1 = l1[0];
            score1 = l1[1];

            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = l2[1];
            // update the scoreboard
            // if (score1 > score2) { 
            //add 3 to team 1 s leagu total on teh score board
        }
    }
}
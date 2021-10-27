/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoccerLeagueApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\27605\\OneDrive\\Documents\\NetBeansProjects\\SoccerApp\\data.txt");
        Scanner sc = null;
        String match, team1, team2, score1, score2;
        int leagueTotal = 0;
        int position = 0;
        HashMap<String, Integer> scoreboard = new HashMap<>();

        String[] sides, l1, l2;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {

            Map<String, Integer> map = new HashMap<>();
            leagueTotal = 0;
            match = sc.nextLine();
            sides = match.split(",");
            l1 = sides[0].split(" ");
            team1 = l1[0];
            score1 = l1[1];

            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = l2[1];

            int teamScore1 = Integer.parseInt(score1);
            int teamScore2 = Integer.parseInt(score2);

            // update the scoreboard
            if (teamScore1 > teamScore2) {

//                        leagueTotal +=3;
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);
//                        scoreboard.put(team1,leagueTotal);
            } else if (teamScore1 < teamScore2) {

//                       leagueTotal +=3;
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);
            } else {
//                            leagueTotal++;
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
            }
        }

        for (String name : scoreboard.keySet()) {
            String key = name;
            String value = scoreboard.get(name).toString();
            position++;
            
            System.out.println(position + ". " + key + " " + value);

        }

    }
}

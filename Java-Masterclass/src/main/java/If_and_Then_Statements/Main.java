/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_and_Then_Statements;

/**
 *
 * @author 27605 (Muhammed Gardee)
 */

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
//        if (isAlien == false)
            if(!isAlien) {
                System.out.println("It is not an alien!");
                System.out.println("And I am scared of aliens");
            }

            int topScore = 80;
            if (topScore < 100){
                System.out.println("New Highscore!");
            }
//            System.out.println("You do not have the high score :-(");
            int secondTopScore = 81;
//            paranthases makes reading better
            if ((topScore > secondTopScore) && (topScore < 100)){
                System.out.println("Greater than second top score and less than 100");
            }


//            || or operator
            if((topScore > 90) || (secondTopScore <= 90)){
                System.out.println("Either or both of the conditions are true.");
            }

            int newValue = 50;
            if(newValue == 50){
                System.out.println("This is an error if it has 1 = sign ");
            }

            boolean isCar = false;
            if(!isCar) {
                System.out.println("This is not true");
            }

        isCar = true;
        boolean wasCar = isCar ? true : false;
            if(wasCar){
                System.out.println("was Car is True");
            }

    }
}

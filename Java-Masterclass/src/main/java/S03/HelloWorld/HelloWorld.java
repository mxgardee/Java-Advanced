/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S03.HelloWorld;

/**
 *
 * @author 27605(Muhammed Gardee)
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello John");

        int myFirstNumber = (10 + 5) + ( 2 * 10 );
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne =  1000 - myTotal;
        
        System.out.println("Total Number: " + myTotal);
        System.out.println("Last one:" + myLastOne);
    
    }
}

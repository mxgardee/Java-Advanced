/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopeChallenge;

/**
 *
 * @author 27605(Muhammed Gardee)
 */

public class Scanner {

    private int x;

    public Scanner (Scanner x){
        System.out.println("Enter a number");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x <= 12;x++){
            System.out.println( x + " * " + this.x + " = " + this.x*x );
        }

    }
}

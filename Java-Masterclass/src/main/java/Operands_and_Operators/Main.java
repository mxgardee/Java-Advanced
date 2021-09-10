/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operands_and_Operators;

/**
 *
 * @author 27605 (Muhammed Gardee)
 */

public class Main {

    public static void main(String[] args) {

        int Result = 1 + 2;
        System.out.println("1 + 2 = " + Result);

        int PreResult = Result;
        System.out.println("Previous Result:" + PreResult);
        Result = Result - 1;
        System.out.println("3-1 =" + PreResult);

        Result = Result * 10;
        System.out.println("2 * 10 =" + Result);

        Result = Result / 5;
        System.out.println("20 / 5 =" + Result);

        Result = Result % 3;
        System.out.println("4 % 3 =" + Result);

        Result ++;
        System.out.println("1 +1 =" + Result);

        Result--;
        System.out.println("2 -1 =" + Result);

        Result += 2; 
        System.out.println("1 + 2 ="+ Result);

        Result *= 10; 
        System.out.println("3 * 10 =" + Result);

        Result /= 3;
        System.out.println("30 / 3 =" + Result);

    }
}

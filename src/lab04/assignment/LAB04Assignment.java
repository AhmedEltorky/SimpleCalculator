/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04.assignment;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ENG-TORKY
 */
public class LAB04Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fNum = 0, sNum = 0;
        String op;
        System.out.println("Please Enter your opertaion (separate between numbers and operator by space): ");
        StringTokenizer st = new StringTokenizer(new Scanner(System.in).nextLine());
        fNum = Double.parseDouble(st.nextToken());
        op = st.nextToken();
        sNum = Double.parseDouble(st.nextToken());

        switch (op) {
            case "+":
                printResult(Double.toString(add(fNum, sNum)));
                break;
            case "-":
                printResult(Double.toString(sub(fNum, sNum)));
                break;
        }
    }

    public static double add(double fNum, double sNum) {
        return fNum + sNum;
    }

    public static double sub(double fNum, double sNum) {
        return fNum - sNum;
    }

    public static void printResult(String res) {
        System.out.println("Result = " + res);
    }

}

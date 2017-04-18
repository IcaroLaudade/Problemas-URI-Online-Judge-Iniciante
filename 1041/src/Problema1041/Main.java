/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1041;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        float y = s.nextFloat();
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0 && y!=0.0) {
            System.out.println("Eixo X");
        } else if (y == 0 && x!=0.0) {
            System.out.println("Eixo Y");
        } else {
            if (x < 0.0 && y < 0.0) {
                System.out.println("Q3");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2");
            } else if (x > 0.0 && y > 0.0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        }

    }

}

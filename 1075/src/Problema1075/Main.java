/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1075;

import java.util.Scanner;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int segundo = s.nextInt();
        for (int i = 2; i < 10000; i++) {
            if (i % segundo == 2) {
                System.out.println(i);
            }
        }
    }

}

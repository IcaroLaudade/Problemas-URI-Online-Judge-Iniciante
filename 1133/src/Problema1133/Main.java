/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1133;

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
        int primeiro = s.nextInt();
        int segundo = s.nextInt();

        if (primeiro < segundo) {
            for (int i = primeiro + 1; i < segundo; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = segundo + 1; i < primeiro; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }

    }

}

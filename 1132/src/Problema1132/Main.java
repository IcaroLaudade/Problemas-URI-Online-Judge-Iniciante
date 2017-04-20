/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1132;

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
        int soma = 0;
        if (primeiro <= segundo) {
            for (int i = primeiro; i <= segundo; i++) {
                if (i % 13 != 0) {
                    soma = soma + i;
                }
            }
        } else {
            for (int i = segundo; i <= primeiro; i++) {
                if (i % 13 != 0) {
                    soma = soma + i;
                }
            }
        }
        System.out.println(soma);
    }

}

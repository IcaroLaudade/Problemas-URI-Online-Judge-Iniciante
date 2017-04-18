/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(inp);
        int numero = Integer.parseInt(r.readLine());

        for (int i = 0; i < numero; i++) {
            int numeros = Integer.parseInt(r.readLine());
            if (numeros == 0) {
               System.out.println("NULL");
            } else {
                if (numeros % 2 == 0) {
                    if (numeros > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (numeros > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        String[] vetor = r.readLine().split(" ");
        Integer[] valoresInt = new Integer[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            valoresInt[i] = Integer.parseInt(vetor[i]);
        }

        Arrays.sort(valoresInt);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(valoresInt[i]);
        }
         System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
       

    }

}

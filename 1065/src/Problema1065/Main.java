/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1065;

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
        int contador=0;
        int numero;
        for (int i = 0; i < 5; i++) {
            numero= Integer.parseInt(r.readLine());
            if (numero % 2==0){
            contador++;
            }
        }
        System.out.println(contador +" valores pares");
    }
    
}

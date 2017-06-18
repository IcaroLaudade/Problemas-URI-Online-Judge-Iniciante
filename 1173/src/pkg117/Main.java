/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int[] numeros = new int[10];
        int primeiro = Integer.parseInt(br.readLine());
        numeros[0]=primeiro;
        System.out.println("N[0] = " + numeros[0]);
        for (int cont = 1; cont < numeros.length; cont++) { 
            numeros[cont]=numeros[cont-1] *2;
                System.out.println("N[" + cont + "] = " + numeros[cont]);

        }
    }
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1172;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int[] numeros = new int[10];
        for (int cont = 0; cont < numeros.length; cont++) {

            int primeiro = Integer.parseInt(br.readLine());

            if (primeiro < 1) {
                numeros[cont] = 1;
            } else {
                numeros[cont] = primeiro;
            }
            System.out.println("X[" + cont + "] = " + numeros[cont]);
        }
    }
}

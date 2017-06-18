/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1175;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        Integer[] numeros = new Integer[20];
        for (int cont = 0; cont < numeros.length; cont++) {
            int primeiro = Integer.parseInt(br.readLine());
            numeros[cont] = primeiro;
        }
        Collections.reverse(Arrays.asList(numeros));
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.println("N[" + cont + "] = " + numeros[cont]);
        }
    }
}

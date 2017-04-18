/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(inp);
        int numero = Integer.parseInt(r.readLine());

        if (numero % 2 == 0) {
            for (int i = 2; i <= numero;i= i+2) {
                System.out.println(i+"^2 = "+i*i);
            }
        } else {
            numero--;
            for (int i = 2; i <= numero;i= i+2) {
                System.out.println(i+"^"+numero+" = "+i*i);
            }

        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(isr);
        int numero = Integer.parseInt(r.readLine());
        for (int contador = 0; contador < numero; contador++) {
            String[] numeros = r.readLine().split(" ");
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);
            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else if (x == 0) {
                System.out.println("0.0");
            } else {
                double resultado = (double) x / y;
                DecimalFormat df = new DecimalFormat("#.0");
                String formatado = df.format(resultado).replace(",", ".");
                System.out.print(formatado+"\n");
            }
        }
    }

}

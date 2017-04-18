/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1071;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(inp);
        int fim = Integer.parseInt(r.readLine());
        int numero = Integer.parseInt(r.readLine());
        if (numero < 0) {

            if (numero % 2 == 0) {
                numero = numero + 1;
                System.out.println(numero);
                int somaneg = 0;
                int somapos = 0;
                if (numero % 2 != 0) {
                    numero = numero + 2;
                    while (numero < 0) {

                        somaneg = somaneg + numero;
                        numero = numero + 2;
                    }
                } else {
                    while (numero < 0) {

                        somaneg = somaneg + numero;
                        numero = numero + 2;
                    }
                }
                while (numero < fim) {
                    somapos = somapos + numero;
                    numero = numero + 2;
                }
                 System.out.println(somapos+somaneg);

            } else {
                int somaneg = 0;
                int somapos = 0;
                if (numero % 2 != 0) {
                    numero = numero + 2;
                    while (numero < 0) {

                        somaneg = somaneg + numero;
                        numero = numero + 2;
                    }
                } else {
                    while (numero < 0) {

                        somaneg = somaneg + numero;
                        numero = numero + 2;
                    }
                }

                while (numero < fim) {
                    somapos = somapos + numero;
                    numero = numero + 2;
                }
                System.out.println(somapos+somaneg);
            }
        } else {
            if (numero % 2 == 0) {
                numero = numero + 1;
                int soma = 0;
                for (int i = numero; i < fim; i = i + 2) {
                    soma += numero;
                    numero += 2;
                }
                System.out.println(soma);
            } else {
                int soma = 0;
                for (int i = numero; i < fim; i = i + 2) {
                    soma += numero;
                    numero += 2;
                }
                System.out.println(soma);
            }
        }
    }

}

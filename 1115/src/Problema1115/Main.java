/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String[] linha;
        int[] linhaint = new int[2];
        while (true) {
            linha = br.readLine().split(" ");
            for (int cont = 0; cont < linha.length; cont++) {
                linhaint[cont] = Integer.parseInt(linha[cont]);
            }
            if (linhaint[0] == 0 || linhaint[1] == 0) {
                break;
            } else {
                if (linhaint[0] > 0 && linhaint[1] > 0) {
                    System.out.println("primeiro");
                } else if (linhaint[0] < 0 && linhaint[1] > 0) {
                    System.out.println("segundo"); 
                }else if (linhaint[0] < 0 && linhaint[1] < 0) {
                    System.out.println("terceiro"); 
                }else if (linhaint[0] > 0 && linhaint[1] < 0) {
                    System.out.println("quarto"); 
                }
            }
        }

    }
}

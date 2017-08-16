/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1557;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int[][] matr;
        int valor = 1;
        int primeirovalor = 1;
        String linha = "";
        int tamanho = 0;
        while (numero != 0) {
            matr = new int[numero][numero];

            for (int contador = 0; contador < numero; contador++) {
                for (int cont = 0; cont < numero; cont++) {

                    matr[contador][cont] = valor;
                    valor = valor * 2;
                }
                // valor = matr[contador][0];
                primeirovalor = (primeirovalor * 2);
                valor = primeirovalor;
            }

            for (int contado = 0; contado < numero; contado++) {
                for (int con = 0; con < numero; con++) {
                    linha = linha + String.valueOf(matr[contado][con]) + ",";
                    //System.out.println(matr[contado][con]);
                }
                
                tamanho = String.valueOf(matr[numero - 1][numero - 1]).length();
                if (tamanho < 2) {
                    linha=linha.replace(",", " ");
                    System.out.println(linha.trim());
                } else if (tamanho == 2) {
                    linha=linha.replace(",", " ");
                    System.out.println(" "+linha.trim());
                }else if (tamanho == 3) {
                    linha=linha.replace(",", "  ");
                    System.out.println("  "+linha.trim());
                }else if (tamanho == 4) {
                    linha=linha.replace(",", "   ");
                    System.out.println("   "+linha.trim());
                }else if (tamanho == 5) {
                    linha=linha.replace(",", "    ");
                    System.out.println("    "+linha.trim());
                }else if (tamanho == 6) {
                    linha=linha.replace(",", "     ");
                    System.out.println("     "+linha.trim());
                }else if (tamanho == 7) {
                    linha=linha.replace(",", "      ");
                    System.out.println("      "+linha.trim());
                }else if (tamanho == 8) {
                    linha=linha.replace(",", "       ");
                    System.out.println("       "+linha.trim());
                }else if (tamanho == 9) {
                    linha=linha.replace(",", "        ");
                    System.out.println("        "+linha.trim());
                }
                linha = "";
                primeirovalor = 1;
                valor = 1;
            }
            System.out.println();
            numero = s.nextInt();
        }
    }

}

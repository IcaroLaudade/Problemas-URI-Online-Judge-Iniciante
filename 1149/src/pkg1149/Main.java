/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String[] linha = br.readLine().split(" ");
        int[] xn = new int[linha.length];
        for (int i = 0; i < linha.length; i++) {
            xn[i] = Integer.parseInt(linha[i]);
        }
        while (xn[1] < 1) {
            {
                String s= br.readLine();
                xn[1] = Integer.parseInt(s);
            }
        }
        int soma=0;
        int contsoma=xn[0]+xn[1];
        for (int cont = xn[0]; cont < contsoma; cont++) {
            soma+=cont;
        }
        System.out.println(soma);
    }

}

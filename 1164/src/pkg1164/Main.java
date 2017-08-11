/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int numero = Integer.parseInt(br.readLine());
        int soma = 0;
        int variavel = 0;
        for (int i = 0; i < numero; i++) {
            variavel = Integer.parseInt(br.readLine());
            for (int j = 1; j < variavel; j++) {
                if (variavel % j == 0) {
                    soma += j;
                }
            }
            if (soma==variavel){
            System.out.println(variavel+" eh perfeito");
            }else{
            System.out.println(variavel+" nao eh perfeito");
            }
            soma=0;
        }
    }

}

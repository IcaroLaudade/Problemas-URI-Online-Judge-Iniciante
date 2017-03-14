/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String entrada = "";
        int qtdParentesesAbertos = 0;
        int i = 0;
        boolean b=false;
        while (i < 10000) {
            i++;
            entrada = br.readLine();
            if (entrada == null) {
                break;
            } else {
                char[] expressao = entrada.toCharArray();

                for (int j = 0; j < expressao.length; j++) {
                    switch (expressao[j]) {
                        case '(':
                            qtdParentesesAbertos++;
                            break;
                        case ')':
                            qtdParentesesAbertos--;
                            break;
                    }
                    if (qtdParentesesAbertos < 0) {
                        System.out.println("incorrect");
                        b=true;
                        break;
                    } 
                   
                }
                 if (qtdParentesesAbertos == 0) {
                        System.out.println("correct");
                    } 
                 else if(!b) {
                   System.out.println("incorrect");
                 }
            }
                 qtdParentesesAbertos = 0;
                 b=false;
            
        }
    }
}

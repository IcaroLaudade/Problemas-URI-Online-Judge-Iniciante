/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        int posicao=0;
        int maior=0;
        int primeiro;
        for (int i=1;i<=100;i++) {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            primeiro =Integer.parseInt(br.readLine());
            if (maior<primeiro){
            posicao=i;
            maior=primeiro;
            }      
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
    
}

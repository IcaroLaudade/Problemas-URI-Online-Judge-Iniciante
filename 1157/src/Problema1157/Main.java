/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1157;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        for (int i = 1; i <= numero; i++) {
        if(numero %i==0){
        System.out.println(i);
        }
        }
    }

}

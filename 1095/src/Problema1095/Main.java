/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1095;

/**
 *
 * @author Icaro
 */
public class Main {

    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        for (int cont = 0; cont < 13; cont++) {
            System.out.println("I=" + i + " J=" + j);
            i += 3;
            j -= 5;
        }
    }
}

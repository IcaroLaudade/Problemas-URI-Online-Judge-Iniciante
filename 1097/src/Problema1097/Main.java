/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1097;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        int tres=0;
        for (int cont = 0; cont < 5; cont++) {
           tres=0;
            while(tres<3){
            System.out.println("I=" + i + " J=" + j);
            j--;
            tres++;
            }
            i += 2;
            j = i+6;
        }
    }
}

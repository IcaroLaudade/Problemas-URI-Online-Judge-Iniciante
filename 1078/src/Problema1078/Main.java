/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader re = new BufferedReader(r);
        short numero =Short.parseShort(re.readLine());
        for (short i=1;i<11;i++){
        System.out.println(i+" x "+numero+ " = "+numero*i);
        }       
    }   
}

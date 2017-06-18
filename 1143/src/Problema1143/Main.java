/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1143;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int numero = Integer.parseInt(br.readLine());
        for (int cont=1;cont<=numero;cont++ ) {
            System.out.println(cont+" "+(cont*cont)+" "+(cont*cont*cont));
        }
    }
}

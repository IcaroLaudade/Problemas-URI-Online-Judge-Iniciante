/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int x = 0;
        int soma = 0;
        while (true) {
            x=Integer.parseInt(br.readLine());
            if (x == 0) {
                break;
            }
            if (x % 2 == 0) {
                for (int i = 0; i < 5; i++) {
                    soma += x;
                    x += 2;
                }
                System.out.println(soma);
            } else if (x % 2 != 0) {
                for (int i = 0; i < 5; i++) {
                    if (i == 0) {
                        x += 1;
                    }
                    soma += x;
                    x += 2;
                }
                System.out.println(soma);
            }
            soma=0;
        }
    }

}

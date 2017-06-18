/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);

        for (int cont = 1; cont > 0; cont++) {
        String[] numeros = br.readLine().split(" ");
        int primeiro=Integer.parseInt(numeros[0]);
        int segundo=Integer.parseInt(numeros[1]);
            if (primeiro == segundo) {
                break;
            }
            if (primeiro< segundo) {
                 System.out.println("Crescente");
            }else{
              System.out.println("Decrescente");
            }
          
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2544;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String linha;
        while ((linha = br.readLine()) != null) {
            int cont = 0;
            int primeiro = Integer.parseInt(linha);
            if (primeiro == 1) {
                System.out.println(primeiro / 2);
            } else {
                while (primeiro > 1) {
                    primeiro /=2;
                    cont++;                  
                }
                System.out.println(cont);
            }
        }
    }
}

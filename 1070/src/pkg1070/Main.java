/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1070;

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
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(inp);
        int numero = Integer.parseInt(r.readLine());
        if (numero % 2 == 0) {
            numero = numero + 1;
            for (int i = 1; i <= 6; i = i + 1) {
                System.out.println(numero);
                numero += 2;
            }
        } else {
            for (int i = 1; i <= 6; i = i + 1) {
                System.out.println(numero);
                numero += 2;
            }
        }
    }

}

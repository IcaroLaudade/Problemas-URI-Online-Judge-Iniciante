/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1072;

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
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader re = new BufferedReader(r);
        int numero = Integer.parseInt(re.readLine());
        int contout=0;
        int contin=0;
        for (int i = 0; i < numero; i++) {
            int numero2 = Integer.parseInt(re.readLine());
            if (numero2 < 10 || numero2 > 20) {
                contout++;
            }
            else{
            contin++;
            }
        }
        System.out.println(contin+" in");
        System.out.println(contout+" out");
    }

}

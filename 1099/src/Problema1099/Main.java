/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        BufferedReader br = new BufferedReader(r);
        int n = Integer.parseInt(br.readLine());
        int total;

        for (int i = 0; i < n; i++) {
            total = 0;
            String[] txt = br.readLine().split(" ");
            int[] txtInt = new int[txt.length];
            for (int cont = 0; cont < txt.length; cont++) {
                txtInt[cont] = Integer.parseInt(txt[cont]);
            }
            Arrays.sort(txtInt);
            for (int cont = txtInt[0] + 1; cont < txtInt[1]; cont++) {
                if (cont % 2 == 1) {
                    total += cont;
                }
            }
            System.out.println(total);

        }
    }

}

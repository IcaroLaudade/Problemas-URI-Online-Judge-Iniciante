/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String linha3;
        int cont2x = 0;
        int cont2y = 0;
        int cont1x = 0;
        int cont1y = 0;
        int x = 0;
        int y = 0;
        while ((linha3 = br.readLine()) != null) {
            String[] linha=linha3.split(" ");
            int[][] matrix = new int[Integer.parseInt(linha[1])][Integer.parseInt(linha[0])];
            for (int i = 0; i < matrix[0].length; i++) {
                String[] linha2 = br.readLine().split(" ");
                for (int j = 0; j < matrix.length; j++) {
                    
                    matrix[j][i] = Integer.parseInt(linha2[j]);
                    if (matrix[j][i] == 2) {
                        cont2x = j;
                        cont2y = i;
                    } else if (matrix[j][i] == 1) {
                        cont1x = j;
                        cont1y = i;
                    }
                }
            }
            if (cont2x > cont1x) {
                x = cont2x - cont1x;
            } else {
                x = cont1x - cont2x;
            }
            if (cont2y > cont1y) {
                y = cont2y - cont1y;
            } else {
                y = cont1y - cont2y;
            }
            System.out.println(x + y);
        }
    }
}

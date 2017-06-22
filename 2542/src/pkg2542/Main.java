/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2542;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int converterInt(String a) {
        return Integer.parseInt(a);
    }
    private static final String vencedor(int podermarcos, int poderleonardo) {
        if (podermarcos > poderleonardo) {
            return "Marcos";
        }
        if (podermarcos < poderleonardo) {
            return "Leonardo";
        }
        return "Empate";

    }

    public static void main(String[] args) throws IOException {
      InputStreamReader inp = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(inp);
        String numeroAtr;
        String[] qtdcartas;
        String[] cartasEscolhidas;
        int[][] matrizmarcos;
        int[][] matrizleonardo;
        String[] carta2;
        String[] carta;
        while ((numeroAtr = br.readLine()) != null) {
            qtdcartas = br.readLine().split(" ");
            matrizmarcos = new int[Integer.parseInt(numeroAtr)][Integer.parseInt(qtdcartas[0])];
            matrizleonardo = new int[Integer.parseInt(numeroAtr)][Integer.parseInt(qtdcartas[1])];

            for (int i = 0; i < matrizmarcos[0].length; i++) {
                carta = br.readLine().split(" ");
                for (int j = 0; j < matrizmarcos.length; j++) {
                    matrizmarcos[j][i] = converterInt(carta[j]);
                }
            }
            for (int i = 0; i < matrizleonardo[0].length; i++) {
                carta2 = br.readLine().split(" ");
                for (int j = 0; j < matrizleonardo.length; j++) {
                    matrizleonardo[j][i] = converterInt(carta2[j]);
                }
            }
            cartasEscolhidas = br.readLine().split(" ");
            int a = converterInt(cartasEscolhidas[0]) - 1;
            int b = converterInt(cartasEscolhidas[1]) - 1;
            String atributoesc = br.readLine();
            int podermarcos = matrizmarcos[converterInt(atributoesc) - 1][a];
            int poderleonardo = matrizleonardo[converterInt(atributoesc) - 1][b];
            System.out.println(vencedor(podermarcos, poderleonardo));
        }
    }
}

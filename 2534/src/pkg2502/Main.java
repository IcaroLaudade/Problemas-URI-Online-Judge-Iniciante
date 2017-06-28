/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String linha;
        String[] s;
        byte[] posicao;
        byte[] numeros = new byte[2];
        Short[] valores;
        while ((linha = br.readLine()) != null) {
            s = linha.split(" ");
            for (byte i = 0; i < s.length; i++) {
                numeros[i] = Byte.parseByte(s[i]);
            }
            valores = new Short[numeros[0]];
            posicao = new byte[numeros[1]];
            for (byte i = 0; i < valores.length; i++) {
                valores[i] = Short.parseShort(br.readLine());
            }
            Arrays.sort(valores, Collections.reverseOrder());
            for (byte i = 0; i < posicao.length; i++) {
                posicao[i] = Byte.parseByte(br.readLine());
                System.out.println(valores[posicao[i] - 1]);
            }
        }
    }
}

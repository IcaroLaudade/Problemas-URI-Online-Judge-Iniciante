/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Icaro
 */
public class Main {

    public static int[] resultadoGrenal(String[] numeros) {
        int[] resultadoGrenal = new int[numeros.length];
        for (int cont = 0; cont < resultadoGrenal.length; cont++) {
            resultadoGrenal[cont] = Integer.parseInt(numeros[cont]);
        }
        return resultadoGrenal;

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String[] numeros = br.readLine().split(" ");
        int[] resultadoGrena = resultadoGrenal(numeros);
        int golInter = resultadoGrena[0];
        int golGremio = resultadoGrena[1];
        int inter = 0;
        int empate = 0;
        int gremio = 0;
        int jogos = 0;
        if (golInter > golGremio) {
            inter++;
        } else if (golInter < golGremio) {
            gremio++;
        } else {
            empate++;
        }
        System.out.println("Novo grenal (1-sim 2-nao)");
        int novo = Integer.parseInt(br.readLine());
        jogos++;
        while (novo < 2) {
            numeros = br.readLine().split(" ");
            resultadoGrena = resultadoGrenal(numeros);
            golInter = resultadoGrena[0];
            golGremio = resultadoGrena[1];
            if (golInter > golGremio) {
                inter++;
            } else if (golInter < golGremio) {
                gremio++;
            } else {
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            novo = Integer.parseInt(br.readLine());
            jogos++;
        }
        System.out.println(jogos + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);
        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }

}

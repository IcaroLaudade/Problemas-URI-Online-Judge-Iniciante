/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            int primeiro = s.nextInt();
            int segundo = s.nextInt();
            if (primeiro < 1 || segundo < 1) {
                break;
            } else {
                int soma = 0;
                String txt = "";
                if (primeiro <= segundo) {
                    for (int i = primeiro; i <= segundo; i++) {
                        soma = soma + i;
                        txt = txt + String.valueOf(i) + " ";

                    }
                } else {
                    for (int i = segundo; i <= primeiro; i++) {
                        soma = soma + i;
                        txt = txt + String.valueOf(i) + " ";

                    }
                }
                System.out.println(txt + "Sum=" + soma);
            }
        }
    }

}

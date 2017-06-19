/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int numero = 0;
        int contgasolina = 0;
        int contdiesel = 0;
        int contalcool = 0;
        while ( numero != 4) {
            numero = Integer.parseInt(br.readLine());
            switch (numero) {
                case 1:
                    contalcool++;
                    break;
                case 2:
                    contgasolina++;
                    break;
                case 3:
                    contdiesel++;
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+contalcool);
        System.out.println("Gasolina: "+contgasolina);
        System.out.println("Diesel: "+contdiesel);
       
    }
}

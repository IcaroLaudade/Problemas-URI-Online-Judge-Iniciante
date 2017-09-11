/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
            Locale.setDefault(Locale.US);
            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            double numero = Double.parseDouble(br.readLine());
            for (int n = 0; n < 100; n++)
            {
                    System.out.printf("N[" + n + "] = %.4f%n", numero);
                    numero = numero / 2.0;
            }
    }
    
}

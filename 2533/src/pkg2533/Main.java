/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2533;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InputStreamReader rs = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rs);
        String numero;
        double result = 0;
        double resultado = 0;
        while ((numero = br.readLine()) != null) {
            int num = Integer.parseInt(numero);
            for (int i = 0; i < num; i++) {
                String[] s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                resultado = resultado+(a * b);
                result += b;
            }
            result *= 100;
            DecimalFormat df = new DecimalFormat("0.0000");
            System.out.println(df.format(resultado/result));
            resultado=0;
            result=0;
        }

    }

}

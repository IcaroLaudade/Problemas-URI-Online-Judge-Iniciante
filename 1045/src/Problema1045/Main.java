/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1045;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        List<String> s = Arrays.asList(br.readLine().split(" "));
        List<Double> i = new ArrayList<>();
        for (String numero : s) {
            i.add(Double.parseDouble(numero));
        }
        Collections.sort(i);
        Collections.reverse(i);
        double a = i.get(0);
        double b = i.get(1);
        double c = i.get(2);

        boolean equilatero = false;
        boolean isosceles = false;
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a == b && b == c) {
                equilatero = true;

            } else if (a == b || b == c || a == c) {
                isosceles = true;

            }
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            if (a > (b + c)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a < (b + c)) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else if (a == (b + c)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (equilatero) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (isosceles) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }

}

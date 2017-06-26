/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1187;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String x = br.readLine();
        double[][] matrix = new double[12][12];
        double soma = 0.0;
        for (int cont = 0; cont < matrix[0].length; cont++) {        
            for (int conta = 0; conta < matrix.length; conta++) {
                double num = Double.parseDouble(br.readLine());
                matrix[conta][cont] = num;
            }
        }
        for (int i = 1; i < 11; i++) {
            soma += matrix[i][0];
        }
        for (int i = 2; i < 10; i++) {
            soma += matrix[i][1];
        }
        for (int i = 3; i < 9; i++) {
            soma += matrix[i][2];
        }
        for (int i = 4; i < 8; i++) {
            soma += matrix[i][3];
        }
        for (int i = 5; i < 7; i++) {
            soma += matrix[i][4];
        }
        Locale.setDefault(Locale.US);
        DecimalFormat df=new DecimalFormat("#.0");
        if (x.equals("S")){
        System.out.println(df.format(soma));
        }
        else if (x.equals("M")){
        double media=soma/30.0;
        System.out.println(df.format(media));
        }
    }

}

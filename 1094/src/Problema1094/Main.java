/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int n = Integer.parseInt(br.readLine());
        int total=0;
        int totalC=0;
        int totalR=0;
        int totalS=0;
        for (int i = 0; i < n; i++) {
            String[] txt=br.readLine().split(" ");
            total+=Integer.parseInt(txt[0]);
            if (txt[1].equals("C")){
                totalC+=Integer.parseInt(txt[0]);
            }
            else  if (txt[1].equals("R")){
                totalR+=Integer.parseInt(txt[0]);
            }
            else   if (txt[1].equals("S")){
                totalS+=Integer.parseInt(txt[0]);
            }
        }
        double pc=((double)totalC/total)*100.0001;
        double pr=((double)totalR/total)*100.0001;
        double ps=((double)totalS/total)*100.0001;
        DecimalFormat df = new DecimalFormat("##.00");   
        System.out.println("Total: "+total+ " cobaias");
        System.out.println("Total de coelhos: "+totalC);
        System.out.println("Total de ratos: "+totalR);
        System.out.println("Total de sapos: "+totalS);
        System.out.println("Percentual de coelhos: "+  df.format(pc).replace(",", ".")+" %");
        System.out.println("Percentual de ratos: "+df.format(pr).replace(",", ".")+" %");
        System.out.println("Percentual de sapos: "+df.format(ps).replace(",", ".")+" %");
    }

}

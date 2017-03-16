/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(r);
        int x=Integer.parseInt(buffer.readLine());
        double y=Double.parseDouble(buffer.readLine());
        System.out.printf("%.3f km/l\r\n",x/y );

    }
    
}

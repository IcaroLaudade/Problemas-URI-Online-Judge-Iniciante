/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1002;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Icaro
 */
public class Problema1002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
       
        DecimalFormat df = new DecimalFormat("0.0000");
       
        double raio;
        raio = s.nextDouble();
        double area = (raio * raio) * 3.14159;
      
        System.out.println("A=" +   df.format(area));

    }

}

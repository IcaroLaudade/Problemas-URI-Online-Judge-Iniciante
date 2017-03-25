/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1015;


import java.util.Scanner;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
 
       double x1=s.nextDouble();
       double y1=s.nextDouble();
       double x2=s.nextDouble();
       double y2=s.nextDouble();
       double distancia=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
       System.out.printf("%.4f", distancia);
    }
    
}

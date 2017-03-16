
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icaro
 */
public class Problema1144 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int linha=s.nextInt();
       for (int contador=1;contador<=linha;contador++){
           
         System.out.println(contador+" "+(int)(Math.pow(contador,2))+" "+(int)(Math.pow(contador,3)));
         System.out.println(contador+" "+(int)(Math.pow(contador,2)+1)+" "+((int)Math.pow(contador,3)+1));
       }
    }
    
}

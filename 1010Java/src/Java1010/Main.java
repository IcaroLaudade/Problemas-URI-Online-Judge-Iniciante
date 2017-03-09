/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1010;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        int codigopeca=s.nextInt();
        int numeropeca=s.nextInt();
        double valorUnitario=s.nextDouble();
        double total= numeropeca * valorUnitario;
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    
    }
    
}

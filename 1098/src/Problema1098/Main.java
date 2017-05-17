/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1098;

import java.text.DecimalFormat;

/**
 *
 * @author Icaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double i = 0.0;
        double j = 1.0;
        int tres = 0;
        DecimalFormat df = new DecimalFormat("0.0");
        for (int cont = 0; cont < 11; cont++) {
            tres = 0;
            while (tres < 3) {
                if (j==Math.rint(j)) {
                    System.out.println("I=" + Math.round(i) + " J=" + (int) j);
                    j++;
                }  else {
                    System.out.println("I=" + df.format(i).replace(",", ".") + " J=" + df.format(j).replace(",", "."));

                    j += 1;
                }
                tres++;
            }
            i += 0.2;
            j = i + 1;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1963;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner s=new Scanner(System.in);
       double a=s.nextDouble();
       double b=s.nextDouble();
       double c=((b/a)-1)*100.00;
       System.out.printf("%.2f%%\n",c);
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
       InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String[] numeros = br.readLine().split(" ");
        short [] array= {Short.parseShort(numeros[0]),
            Short.parseShort(numeros[1]),
            Short.parseShort(numeros[2])};
        Arrays.sort(array);
      
        if (array[0]-array[1]==0 || array[1]-array[2]==0 ||array[0]+array[1]==array[2] ){
        System.out.println("S");
        }
        else{
            System.out.println("N");
        }
    }
    
}

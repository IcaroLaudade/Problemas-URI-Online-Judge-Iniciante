/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1151;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int numero = Integer.parseInt(br.readLine());
        int[] soma=new int[numero];
        soma[0]=0;
        soma[1]=1;
        String sum="0 1";
        for (int cont=2;cont<numero;cont++){
        soma[cont]=soma[cont-1]+soma[cont-2];
        sum+=" "+String.valueOf(soma[cont]);
       
        }
         System.out.println(sum);
    }

}

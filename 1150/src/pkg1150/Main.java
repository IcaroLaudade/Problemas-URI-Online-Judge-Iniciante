/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int x=Integer.parseInt(br.readLine());
        int z=Integer.parseInt(br.readLine());
        while (z<=x){
        z=Integer.parseInt(br.readLine());
        }
        int soma=1;
        int y=x;
        int a=x+1;
        while (y<z){
         soma++;
        y+=a;
        a++;
       
        }
        System.out.println(soma);
    }
    
}

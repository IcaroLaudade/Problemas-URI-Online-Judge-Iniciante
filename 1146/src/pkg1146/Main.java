/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int numero;
        String txt = "";
        while (true) {
            numero = Integer.parseInt(br.readLine());
            if(numero==0){
            break;
            }
            for (int cont = 1; cont <= numero; cont++) {
                if (cont<numero) {
                    txt += cont + " ";
                }
                else{
                txt+=cont;
                }
            }
            System.out.println(txt);
            txt="";
        }
    }
}

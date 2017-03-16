/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1060;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author Icaro
 */
public class Problema1060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        //Buffer     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int contadorPositivo=0;
        for (int contador=0;contador<6;contador++){
        double qtd =Double.parseDouble(br.readLine());
        if (qtd>0){
        contadorPositivo++;
        }
        }
        System.out.println(contadorPositivo+" valores positivos");
    }
    
}

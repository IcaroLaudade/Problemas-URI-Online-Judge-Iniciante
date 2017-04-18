/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int[] vet = new int[2];
		int minutosinicio = 0;
		int minutosfim = 0;
		int aux = 0;
		int hor = 0;
		
		for (int i = 0; i < 2; i++){
			vet[i] = Integer.parseInt(temp[i]);
		}
		
		minutosinicio = vet[0] * 60;
		minutosfim = vet[1] * 60;
				
		if (minutosinicio >= minutosfim){
			aux = ((1440 - minutosinicio) + minutosfim); 
		}else{
			aux = minutosfim - minutosinicio;
		}
		
		hor = aux / 60;
		
		System.out.println("O JOGO DUROU " + hor + " HORA(S)");


    }
    
}

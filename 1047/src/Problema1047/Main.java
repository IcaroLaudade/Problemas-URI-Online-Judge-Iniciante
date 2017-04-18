package Problema1047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int[] vet = new int[4];
		int minutosinicio = 0;
		int minutosfim = 0;
		int aux = 0;
		int hor = 0;
		int min = 0;
		
		for (int i = 0; i < 4; i++){
			vet[i] = Integer.parseInt(temp[i]);
		}
		
		minutosinicio = ((vet[0] * 60) + vet[1]);
		minutosfim = ((vet[2] * 60) + vet[3]);
				
		if (minutosinicio >= minutosfim){
			aux = ((1440 - minutosinicio) + minutosfim); 
		}else{
			aux = minutosfim - minutosinicio;
		}
		
		hor = aux / 60;
		min = aux % 60;
		
		System.out.println("O JOGO DUROU " + hor + " HORA(S) E " + min + " MINUTO(S)");


    }

}

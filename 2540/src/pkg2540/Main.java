/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2540;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String linha;
        String[] nums;
        int cont = 0;
        double total;
        while ((linha = br.readLine()) != null) {
            nums = br.readLine().split(" ");
            int[] numeros = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numeros[i] = Integer.parseInt(nums[i]);
                if (numeros[i] == 1) {
                    cont++;
                }
            }
            total = (double)cont / numeros.length;
            if (total>=0.6666){
            System.out.println("impeachment");
            }else{
            System.out.println("acusacao arquivada");
            }
            cont=0;

        }
    }
}

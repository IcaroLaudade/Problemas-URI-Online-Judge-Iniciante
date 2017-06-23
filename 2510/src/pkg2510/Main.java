/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        int x = Integer.parseInt(br.readLine());
        for (int cont = 0; cont < x; cont++) {
            String s = br.readLine();
            if (s.equals("Batman")){
                System.out.println("N");
            }else{
             System.out.println("Y");
            }

        }
    }

}

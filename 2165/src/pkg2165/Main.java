/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(r);
       int txt=br.readLine().length();
       if (txt>140){
       System.out.println("MUTE");
       }
       else {
       System.out.println("TWEET");
       }
       
    }
    
}

package pkg2221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema2221 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int qtd = Integer.parseInt(br.readLine());
        int bonus = 0;
        String valor1;
        double valorGolpeDabriel=0.0;
        double valorGolpeGuarte=0.0;
              
        for (int i=0; i<qtd ;i++){
            bonus = Integer.parseInt(br.readLine());
            valor1 = br.readLine();
            String[] pokDabriel = valor1.split(" ");
            valor1 = br.readLine();
            String[] pokGuarte = valor1.split(" ");
            
            int atkDabriel = Integer.parseInt(pokDabriel[0]);
            int defDabriel = Integer.parseInt(pokDabriel[1]);
            int lvlDabriel = Integer.parseInt(pokDabriel[2]);
            
            int atkGuarte = Integer.parseInt(pokGuarte[0]);
            int defGuarte = Integer.parseInt(pokGuarte[1]);
            int lvlGuarte = Integer.parseInt(pokGuarte[2]);
            
            if(lvlDabriel%2==0){
                valorGolpeDabriel = ((atkDabriel+defDabriel)/2)+bonus;
            }
            else{
                valorGolpeDabriel = (atkDabriel+defDabriel)/2;
            }
            
            if(lvlGuarte%2==0){
                valorGolpeGuarte = ((atkGuarte+defGuarte)/2)+bonus;
            }
            else{
                valorGolpeGuarte = ((atkGuarte+defGuarte)/2);
            }            
            if(valorGolpeDabriel < valorGolpeGuarte){
                System.out.println("Guarte");
            }
            else if(valorGolpeDabriel > valorGolpeGuarte){
                System.out.println("Dabriel");
            }
            else{
                System.out.println("Empate");
            }   
        }
    }    
}

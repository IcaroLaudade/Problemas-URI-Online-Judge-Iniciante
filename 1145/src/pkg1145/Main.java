package pkg1145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String[] s = br.readLine().split(" ");
        int[] numeros = new int[2];
        for (int i = 0; i < s.length; i++) {
            numeros[i] = Integer.parseInt(s[i]);
        }
        int[] seq = new int[numeros[1]];
        for (int cont = 0; cont < seq.length; cont++) {
            seq[cont] = cont + 1;
        }
        int cont = 0;
        int contador = 0;
        String txt = "";
        while (true) {
            if (cont >= seq.length) {
                break;
            }
            while (cont < seq.length && contador < numeros[0]) {
                
                txt += String.valueOf(seq[cont])+" ";
                cont++;
                contador++;
            }
            String texto = txt.replaceAll("\\s+$", "");
            System.out.println(texto);
            txt = "";
            contador = 0;
        }
    }
}

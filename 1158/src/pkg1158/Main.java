package pkg1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int numeroCasos = Integer.parseInt(br.readLine());
        int soma = 0;
        for (int i = 0; i < numeroCasos; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if (a % 2 == 0) {
                a += 1;
                for (int j = 0; j < b; j++) {
                    soma += a;
                    a = a + 2;
                }
                System.out.println(soma);
            } else {
                for (int j = 0; j < b; j++) {
                    soma += a;
                    a += 2;
                }
                System.out.println(soma);
            }
            soma=0;
        }
    }

}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1179
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] pares = new int[5];
            int[] impares = new int[5];
            int numero;
            int contPar = 0;
            int contImpar = 0;
            for (int i = 0; i < 15; i++)
            {
                numero = int.Parse(Console.ReadLine());
                if (numero % 2 == 0)
                {
                    pares[contPar] = numero;
                    contPar++;
                }
                else
                {
                    impares[contImpar] = numero;
                    contImpar++;
                }

                if (contPar == pares.Length)
                {
                    for (int b = 0; b < 5; b++) {
                        Console.WriteLine("par[" + b + "] = " + pares[b]);
                    }
                    pares = new int[5];
                    contPar = 0;

                }
                if (contImpar == impares.Length)
                {
                    for (int b = 0; b < 5; b++)
                    {
                        Console.WriteLine("impar["+b+"] = "+impares[b]);
                    }
                    impares= new int[5];
                    contImpar=0;
                }
            
            }
            for (int i = 0; i < contImpar; i++)
            {
                Console.WriteLine("impar[" + i + "] = " + impares[i]);
            }
            for (int i = 0; i < contPar; i++)
            {
                Console.WriteLine("par[" + i + "] = " + pares[i]);
            }
        }
    }
}

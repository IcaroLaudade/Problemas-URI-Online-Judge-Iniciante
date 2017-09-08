using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1165
{
    class Program
    {
        static void Main(string[] args)
        {
            int numeroCasos = int.Parse(Console.ReadLine());
            int contador = 0;
            int quebra;
            while (contador < numeroCasos)
            {
                quebra = 0;
                int numero = int.Parse(Console.ReadLine());
                if (numero == 2)
                {
                    Console.WriteLine("2 eh primo");
                }
                else
                {
                    for (int i = 2; i < numero; i++)
                    {
                        if (numero % i == 0)
                        {
                            quebra = 1;
                        }
                    }
                    if (quebra == 0)
                    {
                        Console.WriteLine(numero + " eh primo");
                    }
                    else {
                        Console.WriteLine(numero + " nao eh primo");
                    }
                }
                contador++;
            }
        }
    }
}

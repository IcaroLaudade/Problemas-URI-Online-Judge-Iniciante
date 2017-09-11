using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1176
{
    class Program
    {
        static void Main(string[] args)
        {
            int casosTeste = int.Parse(Console.ReadLine());
            for (int h = 0; h < casosTeste; h++) {
                int numero = int.Parse(Console.ReadLine());
                long soma = 0;
                long i = 1, j = 0;
                    for (int c = 0; c < numero; c++)
                    {
                        soma=i+j;
                        i = j;
                        j = soma;
                    }
                    Console.WriteLine("Fib(" + numero + ") = "+j);        
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1177
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = int.Parse(Console.ReadLine());
            int contador = 0;
            for (int n = 0; n < 1000; n++) {
                if (contador < numero)
                {
                    Console.WriteLine("N[" + n + "] = " + contador);
                }
                else {
                    contador = 0;
                    Console.WriteLine("N[" + n + "] = " + contador);
                }
                contador++;          
            }
        }
    }
}

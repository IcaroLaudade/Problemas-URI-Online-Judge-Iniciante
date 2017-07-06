using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2061
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numeros=Array.ConvertAll(Console.ReadLine().Split(' '),int.Parse);
            int total = numeros[0];
            for (int i = 0; i < numeros[1];i++ )
            {
                String texto = Console.ReadLine();
                if (texto.Equals("fechou"))
                {
                    total++;
                }
                else if (texto.Equals("clicou"))
                {
                    total--;
                }

            }
            Console.WriteLine(total);
        }
    }
}

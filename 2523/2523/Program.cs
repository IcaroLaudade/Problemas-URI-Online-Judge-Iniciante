using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2523
{
    class Program
    {
        static void Main(string[] args)
        {
            string line;
            while ((line = System.Console.ReadLine()) != null)
            {
                char[] letras = line.ToCharArray();
                string txt = "";
                int numero = int.Parse(Console.ReadLine());
                string[] numeros = Console.ReadLine().Split(' ');
                for (int i = 0; i < numeros.Length; i++)
                {
                    txt += letras[int.Parse(numeros[i])-1];
                }
                Console.WriteLine(txt);
            }

        }
    }
}

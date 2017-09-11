using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2635
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = int.Parse(Console.ReadLine());
            string[] sugestoes = new string[numero];
            for (int i = 0; i < sugestoes.Length; i++)
            {
                sugestoes[i] = Console.ReadLine();
            }
            int numPesq = int.Parse(Console.ReadLine());
            for (int j = 0; j < numPesq; j++)
            {
                string txt = Console.ReadLine();
                int num = 0;
                int maior = 0;
                for (int i = 0; i < sugestoes.Length; i++)
                {

                    if (sugestoes[i].Contains(txt))
                    {
                        num++;
                        int aux = sugestoes[i].Length;
                        if (aux > maior)
                        {
                            maior = aux;
                        }
                    }
                }
                if (num > 0)
                {
                    Console.WriteLine(num + " " + maior);
                }
                else
                {
                    Console.WriteLine("-1");
                }
            }
        }
    }
}

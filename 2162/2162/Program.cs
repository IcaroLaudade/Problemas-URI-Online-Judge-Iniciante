using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2162
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = Console.ReadLine();
            int[] vetor = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int i = 0;
            if (vetor.Length == 2)
            {
                if (vetor[0] == vetor[1])
                {
                    Console.WriteLine(0);
                }
                else
                {
                    Console.WriteLine(1);
                }
            }
            else
            {
                for (i = 0; i < vetor.Length - 1; i++)
                {
                    if (vetor[i] == vetor[i + 1] || vetor[i] > vetor[i + 1] && vetor[i + 1] > vetor[i + 2] || vetor[i] < vetor[i + 1] && vetor[i + 1] < vetor[i + 2])
                    {
                        Console.WriteLine(0);
                        break;
                    }

                }
            }
            if (i == vetor.Length - 1)
            {
                Console.WriteLine(1);
            }
        }
    }
}

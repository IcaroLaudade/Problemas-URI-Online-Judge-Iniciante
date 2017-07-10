using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2059
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] vetor = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            if (vetor[3] == vetor[4] && vetor[3] == 0)
            {
                int soma = vetor[1] + vetor[2];
                if (vetor[0] == 0)
                {
                    if (soma % 2 == 1)
                    {
                        Console.WriteLine("Jogador 1 ganha!");
                    }
                    else
                    {
                        Console.WriteLine("Jogador 2 ganha!");
                    }
                }
                else if (vetor[0] == 1)
                {
                    if (soma % 2 == 0)
                    {
                        Console.WriteLine("Jogador 1 ganha!");
                    }
                    else
                    {
                        Console.WriteLine("Jogador 2 ganha!");
                    }
                }
            }
            else if (vetor[3] == vetor[4] && vetor[3] == 1)
            {
                Console.WriteLine("Jogador 2 ganha!");
            }
            else
            {
                Console.WriteLine("Jogador 1 ganha!");
            }
        }
    }
}

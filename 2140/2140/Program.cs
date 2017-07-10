using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2140
{
    class Program
    {
        static void Main(string[] args)
        {
            while(true){
                int[] vetor = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            if (vetor[0] ==vetor[1] && vetor[0]==0){
                break;
            }
                int total=vetor[1]-vetor[0];
                if (total == 200 || total == 150 || total == 120 || total == 110
                    || total == 105 || total == 102 || total == 100 || total == 70 || total == 60 || total == 55 || total == 52
                    || total == 40 || total == 30 || total == 25 || total == 22 || total == 20 || total == 15 || total == 12 || total == 10 || total == 7 || total == 4)
                {
                    Console.WriteLine("possible");
                }
                else {
                    Console.WriteLine("impossible");
                }
            }
        }
    }
}

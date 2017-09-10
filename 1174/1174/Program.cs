using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1174
{
    class Program
    {
        static void Main(string[] args)
        {
            double[] vetor = new double[100];
            for (int i = 0; i < vetor.Length; i++)
            {
                vetor[i] = double.Parse(Console.ReadLine());
                if (vetor[i] <= 10) {
                    Console.WriteLine("A["+i+"] = {0}",vetor[i].ToString("#0.0").Replace(",","."));
                }
            }
        }
    }
}

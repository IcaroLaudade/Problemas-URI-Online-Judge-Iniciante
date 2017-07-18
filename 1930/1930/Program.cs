using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1930
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int soma = 0;
            for (int i = 0; i < array.Length; i++)
            {
                soma += array[i];
            }
            Console.WriteLine(soma - 3);
        }
    }
}

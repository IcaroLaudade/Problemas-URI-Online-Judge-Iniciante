using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int numerosRotacao = int.Parse(Console.ReadLine());
            String[] numeroes = Console.ReadLine().Split(' ');
            int[] array = Array.ConvertAll(numeroes, int.Parse);
            for (int i = 1; i < array.Length;i++ )
            {
                if (array[i - 1] > array[i]) {
                    Console.WriteLine(i+1);
                    break;
                }
                if (i == array.Length - 1) {
                    Console.WriteLine(0);
                    break;
                }
            }
        }
    }
}

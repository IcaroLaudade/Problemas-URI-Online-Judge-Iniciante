using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1933
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            if (array[0] == array[1])
            {
                Console.WriteLine(array[0]);
            }
            else {
                if (array[0] > array[1])
                {
                    Console.WriteLine(array[0]);
                }
                else {
                    Console.WriteLine(array[1]);
                }
            }          
        }
    }
}

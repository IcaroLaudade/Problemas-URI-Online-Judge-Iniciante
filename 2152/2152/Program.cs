using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2152
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n;i++ )
            {
                int[] array = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                if (array[2] == 0 && array[0] < 10 && array[1]<10)
                {
                    Console.WriteLine("0"+array[0] + ":0" + array[1] + " - A porta fechou!");
                }
                else if (array[2] == 1 && array[0] < 10 && array[1] <10)
                {
                    Console.WriteLine("0"+array[0] + ":0" + array[1] + " - A porta abriu!");
                }
                else if (array[2] == 0 && array[0] < 10)
                {
                    Console.WriteLine("0"+array[0] + ":" + array[1] + " - A porta fechou!");
                }
                else if (array[2] == 1 && array[0] < 10)
                {
                    Console.WriteLine("0"+array[0] + ":" + array[1] + " - A porta abriu!");
                }
                else if (array[2] == 0 && array[1] < 10)
                {
                    Console.WriteLine(array[0] + ":0" + array[1] + " - A porta fechou!");
                }
                else if (array[2] == 1 && array[1] < 10)
                {
                    Console.WriteLine( array[0] + ":0" + array[1] + " - A porta abriu!");
                }
                else if (array[2] == 0) {
                    Console.WriteLine(array[0] + ":" + array[1] + " - A porta fechou!");
                }
                else if (array[2] == 1)
                {
                    Console.WriteLine(array[0] + ":" + array[1] + " - A porta abriu!");
                }
            }
            Console.ReadKey();
        }
    }
}

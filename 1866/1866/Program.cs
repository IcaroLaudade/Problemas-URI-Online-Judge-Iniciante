using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1866
{
    class Program
    {
        static void Main(string[] args)
        {
            int c = int.Parse(Console.ReadLine());
            for (int i = 0; i < c; i++)
            {
                int numero = int.Parse(Console.ReadLine()) % 2;
                Console.WriteLine(numero);
            }
        }
    }
}

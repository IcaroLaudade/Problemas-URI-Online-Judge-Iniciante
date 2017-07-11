using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2143
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                int a = int.Parse(Console.ReadLine());
                if (a == 0)
                {
                    break;
                }
                
                for (int i = 0; i < a; i++)
                {
                    int b = int.Parse(Console.ReadLine());
                    if (b % 2 == 1)
                    {
                        Console.WriteLine(((b - 1) * 2) + 1);
                    }
                    else {
                        Console.WriteLine((b - 1) * 2);
                    }
                }
            }
        }
    }
}

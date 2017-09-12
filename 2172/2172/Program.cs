using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2172
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true) {
                string[] s = Console.ReadLine().Split(' ');
                int a = int.Parse(s[0]);
                int b = int.Parse(s[1]);
                if (a == 0 && b == 0) {
                    break;
                }
                Console.WriteLine(a*b);
            }
        }
    }
}

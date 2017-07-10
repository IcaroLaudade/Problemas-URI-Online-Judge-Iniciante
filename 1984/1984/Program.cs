using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1984
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] a = Console.ReadLine().ToCharArray();
            Array.Reverse(a);
            string b = new string(a);
            Console.WriteLine(b);
        }
    }
}

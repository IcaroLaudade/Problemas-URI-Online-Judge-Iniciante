using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2060
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = int.Parse(Console.ReadLine());
            int multiplo2=0, multiplo3=0, multiplo4=0, multiplo5=0;
            int[] array = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            for (int cont = 0; cont < array.Length;cont++)
            {
                if (array[cont] % 2 == 0)
                {
                    multiplo2++;
                }
                if (array[cont] % 3 == 0)
                {
                    multiplo3++;
                }
                if (array[cont] % 4 == 0)
                {
                    multiplo4++;
                }
                if (array[cont] % 5 == 0)
                {
                    multiplo5++;
                }
            }
            Console.WriteLine(multiplo2 + " Multiplo(s) de 2");
            Console.WriteLine(multiplo3 + " Multiplo(s) de 3");
            Console.WriteLine(multiplo4 + " Multiplo(s) de 4");
            Console.WriteLine(multiplo5 + " Multiplo(s) de 5");

        }
    }
}

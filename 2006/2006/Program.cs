using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2006
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            int cont = 0;
            int[] numero=Array.ConvertAll(Console.ReadLine().Split(' '),int.Parse);
            for (int i = 0; i < numero.Length; i++) { 
            if(numero[i]==num){
                cont++;
            }
            }
            Console.WriteLine(cont);
        }
    }
}

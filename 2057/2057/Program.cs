using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2057
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] texto = Console.ReadLine().Split(' ');
            int soma = int.Parse(texto[1]) + int.Parse(texto[2]);
            int primeiro=int.Parse(texto[0]);
            if(primeiro==0){
                primeiro = 24;
            }
            int result = primeiro + soma;
            if (result > 24) {
                result -= 24;
                Console.WriteLine(result);
            }
            else if (result < 24)
            {
                Console.WriteLine(result);
            }
            else {
                Console.WriteLine("0");
            }
        }
    }
}

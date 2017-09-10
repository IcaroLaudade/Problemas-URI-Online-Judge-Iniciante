using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1181
{
    class Program
    {
        static void Main(string[] args)
        {
            int numeroLinha = int.Parse(Console.ReadLine());
            string somaMedia = Console.ReadLine();
            double[,] matriz = new double[12, 12];
            double soma=0;
            for (int i = 0; i < 12; i++)
            {
                for (int j = 0; j < 12; j++)
                {
                    matriz[i, j] = double.Parse(Console.ReadLine());
                    if (i == numeroLinha) {
                        soma += matriz[i, j];
                    }
                }
            }
            if (somaMedia.Equals("S")) {
                string res = string.Format("{0:0.0}", soma);
                res = res.Replace(",", ".");
                Console.WriteLine(res);
            }
            else if (somaMedia.Equals("M")) {
                double r = soma / 12.0;
                string res = string.Format("{0:0.0}", r);
                res = res.Replace(",", ".");
                Console.WriteLine(res);
            }
        }
    }
}

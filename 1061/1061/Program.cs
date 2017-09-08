using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1061
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] dataInicio = Console.ReadLine().Split(' ');
            string horaInicio = Console.ReadLine();
            horaInicio = horaInicio.Replace(" ", "");
            string[] dataFim = Console.ReadLine().Split(' ');
            string horaFim = Console.ReadLine();
            horaFim = horaFim.Replace(" ", "");
            string inicio = dataInicio[1] + "/03/2012 " + horaInicio;
            DateTime dtInicio = DateTime.Parse(inicio);
            string fim = dataFim[1] + "/03/2012 " + horaFim;
            DateTime dtFinal = DateTime.Parse(fim);
            TimeSpan horaTotal = new TimeSpan(dtFinal.Ticks - dtInicio.Ticks);

            string total = horaTotal.ToString(@"dd\:hh\:mm\:ss");
            string[] resultado = total.Split(':');
            if (resultado[0].TrimStart('0').Length == 0)
            {
                Console.WriteLine("0 dia(s)");
            }
            else
            {
                Console.WriteLine(resultado[0].TrimStart('0') + " dia(s)");
            }
           
            if (resultado[1].TrimStart('0').Length==0)
            {
                Console.WriteLine("0 hora(s)");
            }
            else
            {
                Console.WriteLine(resultado[1].TrimStart('0') + " hora(s)");
            }

            if (resultado[2].TrimStart('0').Length == 0)
            {
                Console.WriteLine("0 minuto(s)"); ;
            }
            else
            {
                Console.WriteLine(resultado[2].TrimStart('0') + " minuto(s)");
            }

            if (resultado[3].TrimStart('0').Length == 0)
            {
                Console.WriteLine("0 segundo(s)");
            }
            else
            {               
                Console.WriteLine(resultado[3].TrimStart('0') + " segundo(s)");
            }
            Console.ReadKey();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1960
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = int.Parse(Console.ReadLine());
            string txt="";
            while(numero>0){
                if(numero>899){
                    txt += "CM";
                    numero -= 900;
                }
                else if (numero >= 500) {
                    txt += "D";
                    numero -= 500;
                }
                else if (numero >= 400)
                {
                    txt += "CD";
                    numero -= 400;
                }
                else if (numero >= 100)
                {
                    txt += "C";
                    numero -= 100;
                }
                else if (numero >= 90)
                {
                    txt += "XC";
                    numero -= 90;
                }
                else if (numero >= 50)
                {
                    txt += "L";
                    numero -= 50;
                }
                else if (numero >= 40)
                {
                    txt += "XL";
                    numero -= 40;
                }
                else if (numero >= 10)
                {
                    txt += "X";
                    numero -= 10;
                }
                else if (numero >= 9)
                {
                    txt += "IX";
                    numero -= 9;
                }
                else if (numero >= 5)
                {
                    txt += "V";
                    numero -= 5;
                }
                else if (numero >= 4)
                {
                    txt += "IV";
                    numero -= 4;
                }
                else if (numero >= 1)
                {
                    txt += "I";
                    numero -= 1;
                } 
            }
            Console.WriteLine(txt);
        }
    }
}

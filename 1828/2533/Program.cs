using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2533
{
    class Program
    {
         static void Main(string[] args)
        {
            try
            {
                String[] textos;
                byte numero = byte.Parse(Console.ReadLine());
                for (byte i = 1; i <= numero; i++) {
                    textos = Console.ReadLine().Split(' ');
      
                    if(textos[0].Equals(textos[1]))
                    {
                        Console.WriteLine("Caso #"+i+": De novo!");
                    }
                    else if (winner(textos) == true)
                    {
                        Console.WriteLine("Caso #" + i + ": Bazinga!");
                    }
                    else 
                    {
                        Console.WriteLine("Caso #" + i + ": Raj trapaceou!");                  
                    }
                }

            }catch(Exception erro){
            }
        }
            static bool winner(String [] textos) {
             if (textos[0].Equals("papel") && textos[1].Equals("pedra"))
             {
                 return true;
             }
             if (textos[0].Equals("tesoura") && textos[1].Equals("papel"))
             {
                 return true;
             }
             if (textos[0].Equals("pedra") && textos[1].Equals("lagarto"))
             {
                 return true;
             }
             if (textos[0].Equals("lagarto") && textos[1].Equals("Spock"))
             {
                 return true;
             }
             if (textos[0].Equals("Spock") && textos[1].Equals("tesoura"))
             {
                 return true;
             }
             if (textos[0].Equals("tesoura") && textos[1].Equals("lagarto"))
             {
                 return true;
             }
             if (textos[0].Equals("lagarto") && textos[1].Equals("papel"))
             {
                 return true;
             }
             if (textos[0].Equals("papel") && textos[1].Equals("Spock"))
             {
                 return true;
             }
             if (textos[0].Equals("Spock") && textos[1].Equals("pedra"))
             {
                 return true;
             }
             if (textos[0].Equals("pedra") && textos[1].Equals("tesoura"))
             {
                 return true;
             }
             return false;
         }
    }
}

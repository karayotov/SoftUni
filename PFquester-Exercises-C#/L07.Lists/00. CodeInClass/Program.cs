 using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _00.CodeInClass
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> FirstListEver = Console.ReadLine()
                .Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries)
                .Select(int.Parse)
                .ToList();

            FirstListEver.Reverse();

            for (int i = FirstListEver.Count - 1; i >= 0; i--)
            {
                if (FirstListEver[i] < 0)
                {
                    FirstListEver.RemoveAt(i);
                }
            }
            if(FirstListEver.Count == 0)
            {
                Console.WriteLine("empty");
            }
            else
            {
                Console.WriteLine(string.Join(" ", FirstListEver));
            }
        }
    }
}
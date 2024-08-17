using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        public static void Main(string[] args)
        {            
            int N = int.Parse(Console.ReadLine());
            StringBuilder result = new StringBuilder();

            for (int i = 1; i <= N; i++)
            {
                result.AppendLine(i.ToString());
            }
            
            Console.WriteLine(result);
        }
    }
}
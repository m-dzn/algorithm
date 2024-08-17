using System;
using System.Linq;

namespace Baekjoon
{
    class Program
    {
        public static void Main(string[] args)
        {            
            int[] numbers = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int A = numbers[0];
            int B = numbers[1];

            string result = ">";
            if (A == B)
            {
                result = "==";
            } else if (A < B) {
                result = "<";
            }

            Console.WriteLine(result);
        }
    }
}
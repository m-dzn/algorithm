using System;
using System.Linq;

namespace Baekjoon
{
    class Program
    {
        public static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int result = numbers[0] * numbers[1];
            
            Console.WriteLine(result);
        }
    }
}
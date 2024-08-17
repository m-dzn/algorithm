using System;
using System.Linq;

namespace Baekjoon
{
    class Program
    {
        public static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int result = numbers.Skip(1).Aggregate(numbers[0], (acc, x) => acc - x);
            
            Console.WriteLine(result);
        }
    }
}
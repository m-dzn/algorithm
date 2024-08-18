using System;

namespace Baekjoon
{
    class Program
    {
        static int[] dp = new int[21];
        
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int fibonacciNumber = GetFibonacciNumber(n);
            Console.WriteLine(fibonacciNumber);
        }

        static int GetFibonacciNumber(int n)
        {
            if (n <= 1) return n;

            if (dp[n] != 0) return dp[n];

            dp[n] = GetFibonacciNumber(n - 1) + GetFibonacciNumber(n - 2);
            
            return dp[n];
        }
    }
}
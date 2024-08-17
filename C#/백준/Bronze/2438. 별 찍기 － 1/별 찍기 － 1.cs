using System;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        int N = int.Parse(Console.ReadLine());
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++)
        {
            result.Append('*', i);
            result.AppendLine();
        }

        Console.WriteLine(result);
    }
}
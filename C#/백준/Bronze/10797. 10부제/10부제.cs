using System;
using System.Linq;

class Program {
    public static void Main(string[] args) {
        int day = int.Parse(Console.ReadLine());
        int[] cars = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

        int criteria = day % 10;
        int count = 0;
        foreach (int car in cars)
        {
            if (car == criteria) count++;
        }

        Console.WriteLine(count);
    }
}
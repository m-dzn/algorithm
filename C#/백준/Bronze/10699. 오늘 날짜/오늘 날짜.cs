using System;

namespace Baekjoon
{
    class Program
    {
        public static void Main(string[] args)
        {
            DateTime today = DateTime.Today;
            string formattedDate = today.ToString("yyyy-MM-dd");
            
            Console.WriteLine(formattedDate);
        }
    }
}
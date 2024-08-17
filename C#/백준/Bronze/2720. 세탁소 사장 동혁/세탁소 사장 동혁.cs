using System;

namespace MyCompiler {
    class Program {
        static int[] COIN_VALUES = new int[4] { 25, 10, 5, 1 };
        
        public static void Main(string[] args) {
            int T = ReadNumber();

            for (int t = 0; t < T; t++) {
                int changeInCents = ReadNumber();
                int[] coinCounts = FindOptimalCoins(changeInCents);
                
                PrintCoinCounts(coinCounts);
            }
        }

        /* 주요 로직 */
        public static int[] FindOptimalCoins(int changeInCents) {
            int remainder = changeInCents;
            int[] coinCounts = new int[COIN_VALUES.Length];

            for (int i = 0; i < coinCounts.Length; i++) {
                int unit = GetUnit(i);
                coinCounts[i] = remainder / unit;
                remainder = remainder % unit;
            }
            
            return coinCounts;
        }

        public static int GetUnit(int index) {
            return COIN_VALUES[index];
        }

        /* 유틸 함수 */
        public static int ReadNumber() {
            return int.Parse(Console.ReadLine());
        }

        public static void PrintCoinCounts(int[] coinCounts) {
            string result = String.Join(" ", coinCounts);
            Console.WriteLine(result);
        }
    }
}
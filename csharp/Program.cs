using System;

public class SwapVowels
{
    /// <summary>
    /// Swaps (reverses) the positions of vowels in a string
    /// while keeping consonants in their original positions.
    /// </summary>
    /// <param name="str">The input string</param>
    /// <returns>The string with vowels swapped</returns>
    public static string Swap(string str)
    {
        if (string.IsNullOrEmpty(str) || str.Length <= 1)
        {
            return str;
        }
        
        char[] chars = str.ToCharArray();
        int left = 0;
        int right = chars.Length - 1;
        
        while (left < right)
        {
            // Move left pointer to the next vowel
            while (left < right && !IsVowel(chars[left]))
            {
                left++;
            }
            
            // Move right pointer to the previous vowel
            while (left < right && !IsVowel(chars[right]))
            {
                right--;
            }
            
            // Swap the vowels
            if (left < right)
            {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new string(chars);
    }
    
    /// <summary>
    /// Checks if a character is a vowel (case-insensitive)
    /// </summary>
    /// <param name="c">The character to check</param>
    /// <returns>true if the character is a vowel, false otherwise</returns>
    private static bool IsVowel(char c)
    {
        c = char.ToLower(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static void Main(string[] args)
    {
        // Test cases
        string[] testCases = {
            "hello",
            "leetcode",
            "aeiou",
            "programming",
            "Swap Vowels",
            "bcdfg"
        };
        
        Console.WriteLine("Swap Vowels - C# Implementation");
        Console.WriteLine("================================\n");
        
        foreach (string test in testCases)
        {
            Console.WriteLine($"Input:  \"{test}\"");
            Console.WriteLine($"Output: \"{Swap(test)}\"");
            Console.WriteLine();
        }
    }
}

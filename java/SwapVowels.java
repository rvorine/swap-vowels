public class SwapVowels {
    
    /**
     * Swaps (reverses) the positions of vowels in a string
     * while keeping consonants in their original positions.
     * 
     * @param str The input string
     * @return The string with vowels swapped
     */
    public static String swapVowels(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            
            // Move right pointer to the previous vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
    
    /**
     * Checks if a character is a vowel (case-insensitive)
     * 
     * @param c The character to check
     * @return true if the character is a vowel, false otherwise
     */
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
            "hello",
            "leetcode",
            "aeiou",
            "programming",
            "Swap Vowels",
            "bcdfg"
        };
        
        System.out.println("Swap Vowels - Java Implementation");
        System.out.println("==================================\n");
        
        for (String test : testCases) {
            System.out.println("Input:  \"" + test + "\"");
            System.out.println("Output: \"" + swapVowels(test) + "\"");
            System.out.println();
        }
    }
}

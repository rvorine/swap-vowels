#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

/**
 * Checks if a character is a vowel (case-insensitive)
 */
bool is_vowel(char c) {
    c = tolower(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

/**
 * Swaps (reverses) the positions of vowels in a string
 * while keeping consonants in their original positions.
 * Note: This function modifies the input string in place.
 */
void swap_vowels(char* str) {
    if (str == NULL || strlen(str) <= 1) {
        return;
    }
    
    int left = 0;
    int right = strlen(str) - 1;
    
    while (left < right) {
        // Move left pointer to the next vowel
        while (left < right && !is_vowel(str[left])) {
            left++;
        }
        
        // Move right pointer to the previous vowel
        while (left < right && !is_vowel(str[right])) {
            right--;
        }
        
        // Swap the vowels
        if (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}

int main() {
    // Test cases
    char test1[] = "hello";
    char test2[] = "leetcode";
    char test3[] = "aeiou";
    char test4[] = "programming";
    char test5[] = "Swap Vowels";
    char test6[] = "bcdfg";
    
    printf("Swap Vowels - C Implementation\n");
    printf("===============================\n\n");
    
    printf("Input:  \"%s\"\n", test1);
    swap_vowels(test1);
    printf("Output: \"%s\"\n\n", test1);
    
    printf("Input:  \"%s\"\n", "leetcode");
    swap_vowels(test2);
    printf("Output: \"%s\"\n\n", test2);
    
    printf("Input:  \"%s\"\n", "aeiou");
    swap_vowels(test3);
    printf("Output: \"%s\"\n\n", test3);
    
    printf("Input:  \"%s\"\n", "programming");
    swap_vowels(test4);
    printf("Output: \"%s\"\n\n", test4);
    
    printf("Input:  \"%s\"\n", "Swap Vowels");
    swap_vowels(test5);
    printf("Output: \"%s\"\n\n", test5);
    
    printf("Input:  \"%s\"\n", "bcdfg");
    swap_vowels(test6);
    printf("Output: \"%s\"\n\n", test6);
    
    return 0;
}

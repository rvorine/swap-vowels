"""
Swap Vowels - Python Implementation
Reverses the positions of vowels in a string while keeping consonants in place.
"""

def is_vowel(c: str) -> bool:
    """
    Checks if a character is a vowel (case-insensitive)
    
    Args:
        c: The character to check
        
    Returns:
        True if the character is a vowel, False otherwise
    """
    return c.lower() in 'aeiou'


def swap_vowels(s: str) -> str:
    """
    Swaps (reverses) the positions of vowels in a string
    while keeping consonants in their original positions.
    
    Args:
        s: The input string
        
    Returns:
        The string with vowels swapped
    """
    if not s or len(s) <= 1:
        return s
    
    chars = list(s)
    left = 0
    right = len(chars) - 1
    
    while left < right:
        # Move left pointer to the next vowel
        while left < right and not is_vowel(chars[left]):
            left += 1
        
        # Move right pointer to the previous vowel
        while left < right and not is_vowel(chars[right]):
            right -= 1
        
        # Swap the vowels
        if left < right:
            chars[left], chars[right] = chars[right], chars[left]
            left += 1
            right -= 1
    
    return ''.join(chars)


def main():
    """Main function to test the swap_vowels implementation"""
    test_cases = [
        "hello",
        "leetcode",
        "aeiou",
        "programming",
        "Swap Vowels",
        "bcdfg"
    ]
    
    print("Swap Vowels - Python Implementation")
    print("====================================\n")
    
    for test in test_cases:
        print(f'Input:  "{test}"')
        print(f'Output: "{swap_vowels(test)}"')
        print()


if __name__ == "__main__":
    main()
